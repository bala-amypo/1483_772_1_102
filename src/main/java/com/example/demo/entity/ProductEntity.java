package com.example.demo.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long fields;
    private String name;
    private String brand;
    private String modelnumber;
    private String category;
    public Long getFields() {
        return fields;
    }
    public void setFields(Long fields) {
        this.fields = fields;
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
    public ProductEntity(Long fields, String name, String brand, String modelnumber, String category) {
        this.fields = fields;
        this.name = name;
        this.brand = brand;
        this.modelnumber = modelnumber;
        this.category = category;
    }
    public ProductEntity() {
    }   
}
