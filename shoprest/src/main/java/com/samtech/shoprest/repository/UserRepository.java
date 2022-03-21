package com.samtech.shoprest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samtech.shoprest.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}
