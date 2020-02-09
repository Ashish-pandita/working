package com.sample.postgress.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.postgress.entity.Order;
import com.sample.postgress.entity.Product;
import com.sample.postgress.service.OrderService;

public class OrderDao implements OrderService{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Order> findAll() {
		Query q=entityManager.createQuery("select o from Order o");
		List<Order> Order=q.getResultList();
		return Order;
	}

	@Override
	public List<Order> findByCustomerName(String name) {
		Query q=entityManager.createQuery("select o from Order o where Order.orderedBy:=nam");
		q.setParameter("nam", name);
		return q.getResultList();
	}

	public void createOrder(Order order,List<Product> product) {
		
	}
}

