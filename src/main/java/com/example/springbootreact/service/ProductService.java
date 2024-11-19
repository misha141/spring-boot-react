package com.example.springbootreact.service;

import com.example.springbootreact.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();
    Optional<Product> getProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);


}
