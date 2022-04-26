package com.samtech.shoprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.samtech.shoprest.model.Order;
import com.samtech.shoprest.service.OrderService;

@Controller

public class OrderController {
	
private final OrderService orderService;
	@Autowired
	public OrderController(OrderService orderService) {
		
		this.orderService = orderService;
		
	}
	
	@GetMapping("/orders")
	public String showorders(Model model) {

		System.out.println("***  Inside showorders()....***");
		
		Iterable<Order> orders = orderService.findAllOrder();
		
		model.addAttribute("orders", orders);
		// redirect to the intended page
		return "orders";
				
	}
	

}
