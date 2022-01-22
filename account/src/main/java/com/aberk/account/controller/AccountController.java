package com.aberk.account.controller;

import com.aberk.account.model.Account;
import com.aberk.account.model.Customer;
import com.aberk.account.service.AccountService;
import com.aberk.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        Customer customer = customerService.findById(account.getCustomerId());
        if(customer != null){
            return accountService.addAccount(account);
        }
        else {
            System.out.println("There is no customer with this customer Id, please create a customer first");
            return null;
        }
    }


}
