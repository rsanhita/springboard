package com.samtech.shoprest.service;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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

		Iterable<Order> orders = orderRepository.findAll();

		return orders;

	}

	public Iterable<Order> findOrderByShipVia() throws IOException {

		Iterable<Order> orders = orderRepository.findAll();

		List<Order> filteredList = new ArrayList<Order>();

		for (Order order : orders) {

			boolean result = order.getShipped_date() != null;

			if (result && betweenDates(order.getRequired_date(), order.getShipped_date()) > 15) {

				filteredList.add(order);

			}

		}
		// return ChronoUnit.DAYS.between(filteredList.getRequired_date().toInstant(),
		// filteredList.getShipped_date());

		return filteredList;

	}

	public static long betweenDates(Date firstDate, Date secondDate) throws

	IOException {

		// return ChronoUnit.DAYS.between(firstDate.toInstant(),
		// secondDate.toInstant());

		// Instant int1= firstDate.toInstant();
		// Instant int2= secondDate.toInstant();

		// long numberOfDays = ChronoUnit.DAYS.between(int1, int2);

		return ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant());

	}

	public Iterable<Order> findAllOrdersOfJuly() throws ParseException {

		Iterable<Order> orders = orderRepository.findAll();

		List<Order> filteredList = new ArrayList<Order>();

		for (Order order : orders) {

			if (order.getOrder_date().toString().contains("-07-")) {

				filteredList.add(order);

			}

		}

		// start
		while (filteredList.iterator().hasNext()) {

			Order order = filteredList.iterator().next();

		}

		// end

		return filteredList;

	}

}
