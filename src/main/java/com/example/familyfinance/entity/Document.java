package com.example.familyfinance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;

    @ManyToOne
    @JoinColumn(name = "assetId")
    private Asset asset;

    private  String documentName;
    private String documentType;
    private String filePath;
    private LocalDate expiryDate;

}
