package com.samtech.shoprest.controller;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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



@GetMapping("/customers1")

public String showAllCustomer1(Model model) {
	
	Iterable<Customer> allCustomer = customerService.findAllOrder();
	
	Map<String, Customer> maplist = new HashMap<String, Customer>();
 	//List<Customer> customerlist = new ArrayList<Customer>();
	
	Map<String ,Customer> customermap = new HashMap<String,Customer>();
	
	for (Customer customer:allCustomer) {
		
		customermap.put(customer.getCountry(), customer);
		
	}
	
	System.out.println("*** " + allCustomer.spliterator().SIZED);
	
	System.out.println("*** " + customermap.size());

	Set<String> keySet = customermap.keySet();	
	
	Iterator<String> keys = keySet.iterator();
	
	System.out.println("keys for the set are :::: > ");
	
	int i = 1;
	
	for(String key:keySet){
		
		System.out.println(  i +"   " +  key   );
		
		 i++;
	
	}
			
	
	System.out.println(" For each key set we have objects as below :");

	
	customermap.get("Argentina");
	
	Set<String> keySet1 = customermap.keySet();
		
	Set<Entry<String, Customer>> entrySet = customermap.entrySet();
	
	Collection<Customer> customers = customermap.values();
	
	for(Customer customer:customers) {
		System.out.println(customer.toString() );
		

		
	}

	
	model.addAttribute("customers", allCustomer);
	
	return "customers";
	
}



}
