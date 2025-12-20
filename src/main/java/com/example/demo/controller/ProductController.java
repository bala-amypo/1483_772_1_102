package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add a product")
    public ResponseEntity<Product> addProduct(
            @RequestBody Product product
    ) {
        return ResponseEntity.ok(
                productService.addProduct(product)
        );
    }

    @GetMapping("/list all products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(
                productService.getAllProducts()
        );
    }
}
