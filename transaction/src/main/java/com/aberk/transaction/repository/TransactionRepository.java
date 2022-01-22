package com.aberk.transaction.repository;

import com.aberk.transaction.model.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

    List<Transaction> findByAccountId(int accountId);
}
