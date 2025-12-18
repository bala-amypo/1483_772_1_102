package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
@RestController
public class ProductController {
    @Autowired
    ProductService ps;
    @PostMapping("/addproduct")
    public ProductEntity add(@RequestBody ProductEntity pe)
    {
        return ps.addproduct(pe);
        
    }
    @GetMapping("/show")
    public List<ProductEntity>get()
    {
        return ps.getall();
    }
}
