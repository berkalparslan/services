package com.aberk.account.service;

import com.aberk.account.model.Customer;
import com.aberk.account.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addNewCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findById(int id){
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customer -> customers.add(customer));
        return customers;
    }


}
