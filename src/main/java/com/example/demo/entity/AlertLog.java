package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alert_logs")
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "warranty_id", nullable = false)
    private Warranty warranty;

    private LocalDateTime sentAt;

    private String message;

    public AlertLog() {
    }

    public AlertLog(Long id, Warranty warranty,
                    LocalDateTime sentAt, String message) {
        this.id = id;
        this.warranty = warranty;
        this.sentAt = sentAt;
        this.message = message;
    }

    @PrePersist
    public void prePersist() {
        this.sentAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public String getMessage() {
        return message;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
