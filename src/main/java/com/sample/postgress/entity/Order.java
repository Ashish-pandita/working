package com.sample.postgress.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Order {

    @Id
    @GeneratedValue
    int orderId;
    
    String orderedBy;
    
    @ManyToMany
    @JoinColumn(name = "listOfProducts")
    List<Product> listOfProducts;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	public Order(int orderId, String orderedBy, List<Product> listOfProducts) {
		super();
		this.orderId = orderId;
		this.orderedBy = orderedBy;
		this.listOfProducts = listOfProducts;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

