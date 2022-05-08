package com.samtech.shoprest.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.samtech.shoprest.model.Account;
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
	
	
	@GetMapping("/api/orders/{id}")
	
	public String getEmployeesById(@PathVariable String id,Model model) {
	
	    
	    System.out.println( "ID: " + id );
	    
	    return "home" ;
	}
	
	@GetMapping("/api/employees/{id}/{name}")

	public String getEmployeesByIdAndName(@PathVariable String id, @PathVariable String name) {
		
		
		System.out.println( "ID: " + id + ", name: " + name );
		
	    return "home";
	    
	    
	    
	}
	
	
	@GetMapping("/orders1")
	public String showoShipViaList(Model model) throws IOException {
		
		//Iterable<Order> orders = orderService.findAllOrder();
		
		Iterable<Order> orders = orderService.findOrderByShipVia();
		
		//List<Order> orderList = new ArrayList<Order>();
		
		
		
		model.addAttribute("orders", orders);
		
		
		return "orders"; 
	}
	
	@GetMapping("/orders2")
	public String showoFiltered(Model model) {
		
		Iterable<Order> iterableOrder = orderService.findAllOrder();
		
		List<Order> orderList = new ArrayList<Order>(); 
						
				
		for (Order order : iterableOrder) {
			//
			
			
			//Integer i1 = Integer.parseInt(order.getCustomer_id());	
			
			 //order.getCustomer_id();
			
			if( order.getEmployee_id() > 3) {
				
				orderList.add(order);
				
							}
			
		}
		
		model.addAttribute("orders",orderList);
		
		
				return "orders"; 
	}
	
	@GetMapping("/orders3")
	public String showJulyOrder(Model model) throws ParseException {

		System.out.println("***  Inside showorders()....***");
		
		Iterable<Order> orders = orderService.findAllOrdersOfJuly();
		
		model.addAttribute("orders", orders);
		// redirect to the intended page
		return "orders";
				
	}
	
	

}
