package com.aberk.account.controller;

import com.aberk.account.model.Customer;
import com.aberk.account.service.AccountService;
import com.aberk.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    private Customer getCustomer(@PathVariable int id) {
        return customerService.findById(id);
    }

    @GetMapping
    private List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping
    private Customer addNewCustomer(@RequestBody Customer customer) {
        return customerService.addNewCustomer(customer);
    }


}
