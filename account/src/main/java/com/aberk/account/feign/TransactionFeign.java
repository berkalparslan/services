package com.aberk.account.feign;

import com.aberk.account.feign.model.TransactionModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "transaction-service")
public interface TransactionFeign {

    @GetMapping("/transactions/{accountId}")
    public List<TransactionModel> getAccountTransactions(@PathVariable int accountId);

    @PostMapping("/transactions/trx")
    public TransactionModel createNewTransaction(@RequestBody TransactionModel transaction);
}
