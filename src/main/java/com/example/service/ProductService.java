package com.example.service;

import com.example.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product saveProduct(Product product);
}
