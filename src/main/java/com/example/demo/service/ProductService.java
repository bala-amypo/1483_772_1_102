package com.example.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ProductEntity;
@Service
public interface ProductService {
    ProductEntity  addProduct(ProductEntity pe);
    List<ProductEntity> getAllProducts();   
}
