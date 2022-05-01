package com.samtech.shoprest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samtech.shoprest.model.Customer;
import com.samtech.shoprest.repository.CustomerRepository;


@Service
public class CustomerService {
	
	
	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {

		this.customerRepository = customerRepository;
		
	}
	
	public Iterable<Customer> findAllOrder() {

		Iterable<Customer> customers = customerRepository.findAll();

		return customers;

	}


}
