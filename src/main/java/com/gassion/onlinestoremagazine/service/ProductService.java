package com.gassion.onlinestoremagazine.service;

import com.gassion.onlinestoremagazine.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    Product updateProduct(Product product);

    List<Product> getAllProduct();

    Optional<Product> getProductById(long productId);

    void deleteProductById(long productId);
}
