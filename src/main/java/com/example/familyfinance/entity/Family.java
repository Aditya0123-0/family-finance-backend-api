package com.example.familyfinance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long family_id;

    @Column(nullable = false)
    private String familyName;
}
