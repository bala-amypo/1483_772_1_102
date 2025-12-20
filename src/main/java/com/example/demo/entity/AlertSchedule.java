package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alert_schedules")
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "warranty_id", nullable = false)
    private Warranty warranty;

    private Integer daysBeforeExpiry;

    private Boolean enabled;

    public AlertSchedule() {
    }

    public AlertSchedule(Long id, Warranty warranty,
                         Integer daysBeforeExpiry, Boolean enabled) {
        this.id = id;
        this.warranty = warranty;
        this.daysBeforeExpiry = daysBeforeExpiry;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public Integer getDaysBeforeExpiry() {
        return daysBeforeExpiry;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public void setDaysBeforeExpiry(Integer daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
