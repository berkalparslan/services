package com.aberk.transaction.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue
    private int id;

    private int accountId;

    private BigDecimal amount;

    public Transaction() {
    }

    public Transaction(int accountId, BigDecimal amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

}