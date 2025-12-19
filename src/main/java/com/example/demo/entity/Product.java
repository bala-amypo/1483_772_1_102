package com.example.demo.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Entity;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long productid;
    private String name;
    private String brand;
    @NotBlank(message = "Model number required")
    private String modelNumber;
    @NotBlank(message = "Category required")
    private String category;
    public Long getproductid() {
        return productid;
    }
    public void setproductid(Long productid) {
        this.productid = productid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Product(Long productid, String name, String brand, String modelNumber, String category) {
        this.productid = productid;
        this.name = name;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.category = category;
    }
    public Product() {
    }   
}
