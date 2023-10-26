package com.example.productmicro.repositories;

import com.example.productmicro.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {

    // Define custom query methods if needed
}
