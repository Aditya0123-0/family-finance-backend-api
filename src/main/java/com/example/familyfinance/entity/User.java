package com.example.familyfinance.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation;
import org.stringtemplate.v4.ST;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long userid;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private  String role;

    private String email;
    private  String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;
}
