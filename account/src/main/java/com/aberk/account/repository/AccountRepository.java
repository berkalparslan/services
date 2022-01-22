package com.aberk.account.repository;

import org.springframework.data.repository.CrudRepository;
import com.aberk.account.model.Account;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    List<Account> findByCustomerId(int customerId);
}
