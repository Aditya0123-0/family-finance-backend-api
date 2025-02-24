package com.example.familyfinance.service;

import com.example.familyfinance.entity.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    Transaction getTransactionById(Long transactionId);
    List<Transaction> getAllTransaction();
    Transaction updtaeTransaction(Long transactionId, Transaction transaction);
    void deleteTransaction(Long transactionId);

}
