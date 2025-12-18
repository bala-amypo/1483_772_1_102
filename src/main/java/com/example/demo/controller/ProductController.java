package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
@RestController
public class ProductController {
    @Autowired
    ProductService ps;
    @PostMapping("/add a product")
    public Product add(@RequestBody Product pe)
    {
        return ps.addProduct(pe);
        
    }
    @GetMapping("/list all products")
    public List<Product>get()
    {
        return ps.getAllProducts();
    }
}
