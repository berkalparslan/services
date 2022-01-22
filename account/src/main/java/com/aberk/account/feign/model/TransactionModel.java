package com.aberk.account.feign.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class TransactionModel {

    @Id
    @GeneratedValue
    private int id;

    private int accountId;

    private BigDecimal amount;

    public TransactionModel() {
    }

    public TransactionModel(int accountId, BigDecimal amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

}