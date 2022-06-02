package com.samtech.shoprest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.model.Order;
import com.samtech.shoprest.service.AcctMgmtService;
import com.samtech.shoprest.service.OrderService;

@RestController
@RequestMapping("/accts")
public class AccountJsonController {
	
	@Autowired
    private AcctMgmtService service;
	
	@Autowired
    private OrderService orderService;
	
	
	
	@GetMapping("/")
	@ResponseBody
	 public Iterable<Account> retrieveAccounts () {
		 
	    Iterable<Account> acctlist  =   service.findAllNonBlankAccts();
	        
	        return acctlist;
	}
	
	
	@PostMapping("/addacct")
	@ResponseBody
	//public ResponseEntity<Account> create(@RequestBody Account account) 
	public Account create(@RequestBody Account account)
	     {
		return service.saveAccount(account);
		
	}

	
	@GetMapping("/orders")
	public Iterable<Order> showorders() {

		Iterable<Order> orders = orderService.findAllOrder();

		return orders;

	}

}
