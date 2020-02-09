package com.sample.postgress.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	int productId;
	String prodcutName;
	double productPrice;
	int productQuantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProdcutName() {
		return prodcutName;
	}
	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Product(int productId, String prodcutName, double productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.prodcutName = prodcutName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
