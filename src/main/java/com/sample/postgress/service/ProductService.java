package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.Product;

public interface ProductService {

	List<Product> findAll();

	void addAProduct(Product pro);

	void updateProdut(Product pro);

	void executeUpdateProduct(Product pro);

	public void deleteProduct(Product pro);
}
