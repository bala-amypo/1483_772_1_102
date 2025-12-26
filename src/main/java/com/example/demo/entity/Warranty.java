package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


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

}
