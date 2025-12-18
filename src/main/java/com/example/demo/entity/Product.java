package com.example.demo.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String modelnumber;
    private String category;
    public Long getid() {
        return id;
    }
    public void setid(Long id) {
        this.id = id;
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
    public String getModelnumber() {
        return modelnumber;
    }
    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Product(Long id, String name, String brand, String modelnumber, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.modelnumber = modelnumber;
        this.category = category;
    }
    public Product() {
    }   
}
