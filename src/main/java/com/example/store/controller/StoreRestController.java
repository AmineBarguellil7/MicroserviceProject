package com.example.store.controller;

import com.example.store.entity.Store;
import com.example.store.repos.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/store")
public class StoreRestController {
    @Autowired
    StoreRepository storeRepo;


    @PostMapping("")
    public Store addStore(@RequestBody Store store) {
        return storeRepo.save(store);
    }

    @GetMapping("")
    public List<Store> ListStores () {
        return storeRepo.findAll();
    }

    @GetMapping("/{id}")
    public Store storeById (@PathVariable Integer id) {
        return storeRepo.findById(id).orElse(null);
    }


    @PutMapping("/updatestore")
    public Store updateStore(@RequestBody Store store) {
        return storeRepo.save(store);
    }

    @DeleteMapping("/{id}")
    public void deleteStore (@PathVariable Integer id) {
        if (storeRepo.findById(id).isPresent())
            storeRepo.deleteById(id);
    }

}
