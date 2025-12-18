package com.example.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
@Service
public interface ProductService {
    Product  addProduct(Product pe);
    List<Product> getAllProducts();   
}
