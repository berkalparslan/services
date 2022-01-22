package com.aberk.account.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private int id;
    private int customerId;
    private Long balance;

    public Account() {
    }

    public Account(int customerId, long initialBalance) {
        this.customerId = customerId;
        this.balance = balance;
    }

    public void addAmount(long amount){
        balance += amount;
    }

}
