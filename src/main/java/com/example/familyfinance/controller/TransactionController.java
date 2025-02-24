package com.example.familyfinance.controller;

import com.example.familyfinance.entity.Transaction;
import com.example.familyfinance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/{transactionId}")
    public Transaction getTransactionById(@PathVariable Long transactionId){
        return transactionService.getTransactionById(transactionId);
    }

    @GetMapping
    public List<Transaction> getAllTransaction(){
        return transactionService.getAllTransaction();
    }

    @PutMapping("/{transactionId}")
    public Transaction updtaeTransaction(@PathVariable Long transactionId, @RequestBody Transaction transaction){
        return transactionService.updtaeTransaction(transactionId,transaction);
    }

    @DeleteMapping("/{transactionId}")
    public void deleteTransaction(@PathVariable Long transactionId){
        transactionService.deleteTransaction(transactionId);
    }
}
