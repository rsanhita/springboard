package com.samtech.shoprest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samtech.shoprest.model.Account;
@Repository
public interface AccountRepository extends CrudRepository< Account, Long> {

	Iterable<Account> findByAcctNameAndAcctNumberIn(String acctName,List<String> acctNumber );
}
 