package com.example.productmicro.controllers;

import com.example.productmicro.entities.Product;
import com.example.productmicro.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{product-id}")
    public Optional<Product> getProductById(@PathVariable("product-id") Integer productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/remove/{product-id}")
    public void removeProduct(@PathVariable("product-id") Integer productId) {
        productService.removeProduct(productId);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    // You can add additional endpoints as needed for your specific requirements.
}
