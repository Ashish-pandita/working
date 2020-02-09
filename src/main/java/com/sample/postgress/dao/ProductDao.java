package com.sample.postgress.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.Product;
import com.sample.postgress.service.ProductService;

@Repository
public class ProductDao implements ProductService{

	@Autowired
	EntityManager entitymanage;
	
	@Override
	public List<Product> findAll() {
		Query q=entitymanage.createQuery("select p from Product p");
		List<Product> products=q.getResultList();
		return products;
	}

	@Transactional
	public void addAProduct(Product pro) {
		
		entitymanage.merge(pro);
		
	}

	@Transactional
	@Override
	public void updateProdut(Product pro) {
		Product product=entitymanage.find(Product.class, pro.getProductId());
		product.setProdcutName(pro.getProdcutName());
		product.setProductPrice(pro.getProductPrice());
		product.setProductQuantity(pro.getProductQuantity());
		entitymanage.persist(product);
		
	}

	@Override
	public void executeUpdateProduct(Product pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(Product pro) {
		// TODO Auto-generated method stub
		
	}
	
	
}
