package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl
        implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {

        if (product.getModelNumber() == null ||
                product.getModelNumber().trim().isEmpty()) {
            throw new IllegalArgumentException("Model number required");
        }

        if (product.getCategory() == null ||
                product.getCategory().trim().isEmpty()) {
            throw new IllegalArgumentException("Category required");
        }

        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
