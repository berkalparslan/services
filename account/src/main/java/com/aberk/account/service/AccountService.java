package com.aberk.account.service;

import com.aberk.account.model.Account;
import com.aberk.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account findAccountById(int accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    public List<Account> getAccountsWithCustomerId(int customerId){
        return accountRepository.findByCustomerId(customerId);
    }

    public Account addAccount(Account account){

        return account;
    }
}
