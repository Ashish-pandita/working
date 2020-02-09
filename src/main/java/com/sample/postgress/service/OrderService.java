package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.Order;

public interface OrderService {

	List<Order> findAll();
	List<Order> findByCustomerName(String name);
	
}
