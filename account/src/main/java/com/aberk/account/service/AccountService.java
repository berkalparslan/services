package com.aberk.account.service;

import com.aberk.account.feign.TransactionFeign;
import com.aberk.account.feign.model.TransactionModel;
import com.aberk.account.model.Account;
import com.aberk.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    TransactionFeign transactionFeign;

    public Account findAccountById(int accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    public List<Account> getAccountsWithCustomerId(int customerId){
        return accountRepository.findByCustomerId(customerId);
    }

    public Account addAccount(Account account){
        if(account.getBalance() != 0){
            try {
                accountRepository.save(account);
                TransactionModel initial_balance = new TransactionModel(account.getId(), account.getBalance(), "Initial Balance");
                transactionFeign.createNewTransaction(initial_balance);

                System.out.println("adding amount to accounts");
            }
            catch(Exception e){
                System.out.println(e + "  error");
            }
        } else {
            System.out.println("adding 0 amount account");
            account = accountRepository.save(account);
        }

        return account;
    }
}
