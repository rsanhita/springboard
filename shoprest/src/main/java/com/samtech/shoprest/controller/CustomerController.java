package com.samtech.shoprest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.samtech.shoprest.model.Customer;

import com.samtech.shoprest.service.CustomerService;

@Controller
public class CustomerController {
	
	private final CustomerService customerService ;
	
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
		
		
	}
	
@GetMapping("/customer")

public String showAllCustomer(Model model) {
	
	Iterable<Customer> customer = customerService.findAllOrder();
	
	model.addAttribute("customers", customer);
	
	return "customers";
	
}




}
