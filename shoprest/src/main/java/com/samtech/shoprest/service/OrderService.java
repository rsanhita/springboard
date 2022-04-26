package com.samtech.shoprest.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.samtech.shoprest.model.Order;
import com.samtech.shoprest.repository.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	@Autowired
	public OrderService(OrderRepository orderRepository) {
		
		this.orderRepository = orderRepository;
	}
	
	
	public Iterable<Order> findAllOrder() {
		
	Iterable<Order>orders =	orderRepository.findAll();
	
	return orders;
		
		
	}
	

}

