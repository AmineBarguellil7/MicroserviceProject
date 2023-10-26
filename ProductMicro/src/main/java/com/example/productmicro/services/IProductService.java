package com.example.productmicro.services;

import com.example.productmicro.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    Product addProduct(Product product);

    void removeProduct(Integer productId);

    Product updateProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(Integer productId);
}
