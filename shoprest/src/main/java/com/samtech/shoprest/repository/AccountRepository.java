package com.samtech.shoprest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samtech.shoprest.model.Account;
@Repository
public interface AccountRepository extends CrudRepository< Account, Long> {

}
 