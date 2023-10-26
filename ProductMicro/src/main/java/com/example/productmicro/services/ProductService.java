package com.example.productmicro.services;

import com.example.productmicro.entities.Product;
import com.example.productmicro.repositories.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ProductService")
@AllArgsConstructor
public class ProductService implements IProductService {

    private IProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public void removeProduct(Integer productId) {
        productRepository.deleteById(productId);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    // You can add additional methods or services specific to your product business logic here.
}
