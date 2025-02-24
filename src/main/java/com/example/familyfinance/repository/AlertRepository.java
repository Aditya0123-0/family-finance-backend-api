package com.example.familyfinance.repository;

import com.example.familyfinance.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<Alert,Long> {
}
