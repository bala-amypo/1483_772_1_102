package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "warranties")
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Relationships */

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    /* Fields */

    private LocalDate purchaseDate;

    private LocalDate expiryDate;

    @Column(unique = true, nullable = false)
    private String serialNumber;

    /* Optional future relationships */

    @OneToMany(mappedBy = "warranty")
    private List<AlertSchedule> alertSchedules;

    @OneToMany(mappedBy = "warranty")
    private List<AlertLog> alertLogs;

    /* No-arg constructor */
    public Warranty() {
    }

    /* All-args constructor */
    public Warranty(Long id, User user, Product product,
                    LocalDate purchaseDate,
                    LocalDate expiryDate,
                    String serialNumber) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.serialNumber = serialNumber;
    }

    /* Getters & Setters */

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
