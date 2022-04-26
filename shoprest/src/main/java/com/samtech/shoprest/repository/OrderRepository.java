package com.samtech.shoprest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samtech.shoprest.model.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
