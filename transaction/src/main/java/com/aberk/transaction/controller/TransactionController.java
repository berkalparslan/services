package com.aberk.transaction.controller;

import com.aberk.transaction.model.Transaction;
import com.aberk.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{accountId}")
    public List<Transaction> getAccountTransactions(@PathVariable int accountId) {
        System.out.println("getaccounttransactions...");
        return transactionService.findByAccountId(accountId);
    }

    @PostMapping("/trx")
    public Transaction createNewTransaction(@RequestBody Transaction transaction) {
        return transactionService.create(transaction);
    }

}
