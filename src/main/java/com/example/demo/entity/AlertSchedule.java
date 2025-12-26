package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


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

    
}
