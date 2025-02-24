package com.example.familyfinance.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.stringtemplate.v4.ST;

@Entity
@Data
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long assetId;

    @Column(nullable = false)
    private String assetType;

    @Column(nullable = false)
    private String assetName;
    private double assetValue;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private  Family family;
}
