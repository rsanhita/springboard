package com.samtech.shoprest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samtech.shoprest.model.Student;

@Repository

public interface StudentRepository extends CrudRepository< Student, Long> {
	
}
		
		
