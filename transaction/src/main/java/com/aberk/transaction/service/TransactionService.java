package com.aberk.transaction.service;

import com.aberk.transaction.model.Transaction;
import com.aberk.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findByAccountId(int accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    public Transaction create(Transaction transaction){
        return transactionRepository.save(transaction);
    }
}
