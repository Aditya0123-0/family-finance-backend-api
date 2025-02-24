package com.example.familyfinance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "assetId")
    private Asset asset;

    private LocalDate transactionDate;
    private String transactionType;
    private double amount;
    private String category;
    private String description;
}
