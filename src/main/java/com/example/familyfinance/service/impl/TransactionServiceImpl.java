package com.example.familyfinance.service.impl;

import com.example.familyfinance.entity.Transaction;
import com.example.familyfinance.repository.TransactionRepository;
import com.example.familyfinance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction getTransactionById(Long transactionId) {
        return transactionRepository.findById(transactionId).orElse(null);
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction updtaeTransaction(Long transactionId, Transaction transaction) {
        if(transactionRepository.existsById(transactionId)){
            transaction.setTransactionId(transactionId);
            return transactionRepository.save(transaction);
        }
        return null;
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }
}
