package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository pr;
    @Override
    public Product  addProduct(Product pe)
    {
        return pr.save(pe);
    }
    public List<Product> getAllProducts()
    {
        return pr.findAll();
    }  
}
