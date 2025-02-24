package com.example.familyfinance.repository;

import com.example.familyfinance.entity.Transaction;
//import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
