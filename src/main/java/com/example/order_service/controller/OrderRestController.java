package com.example.order_service.controller;

import com.example.order_service.entity.Order;
import com.example.order_service.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderRestController {

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping("")
    public List<Order> listOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order orderById(@PathVariable Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    @PutMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id) {
        if (orderRepository.findById(id).isPresent())
            orderRepository.deleteById(id);
    }
}
