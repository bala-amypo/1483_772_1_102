package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product addProduct(Product product) {
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return Collections.emptyList();
    }
}
