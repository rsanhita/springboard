package com.samtech.shoprest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samtech.shoprest.model.User;

@Repository
//the angular brackets are for using Generics.
//Generics was introduced in Java 1.5
public interface UserRepository extends CrudRepository<User, Long> {
	
}


