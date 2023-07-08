package com.gassion.onlinestoremagazine.service;

import com.gassion.onlinestoremagazine.entity.Product;
import com.gassion.onlinestoremagazine.repository.ProductRepository;
import com.gassion.onlinestoremagazine.util.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    public final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Optional <Product> productDb = productRepository.findById(product.getId());

        if(productDb.isEmpty()) throw new ResourceNotFoundException("Record not found with id : " + product.getId());

        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new  ResourceNotFoundException("Record not found with id : " + productId));
    }

    @Override
    public void deleteProductById(long productId) {
        productRepository.deleteById(productId);
    }
}
