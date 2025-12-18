package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository pr;
    @Override
    public ProductEntity  addproduct(ProductEntity pe)
    {
        return pr.save(pe);
    }
    public List<ProductEntity> getall()
    {
        return pr.findAll();
    }  
}
