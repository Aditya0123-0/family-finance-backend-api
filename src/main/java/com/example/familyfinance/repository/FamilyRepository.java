package com.example.familyfinance.repository;

import com.example.familyfinance.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family,Long> {
}
