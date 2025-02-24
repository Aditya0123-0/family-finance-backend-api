package com.example.familyfinance.repository;

import com.example.familyfinance.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset,Long> {
}
