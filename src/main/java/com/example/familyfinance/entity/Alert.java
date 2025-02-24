package com.example.familyfinance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;
    private String alertType;
    private LocalDate alertDate;
    private String message;

}
