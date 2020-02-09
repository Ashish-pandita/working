package com.sample.postgress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.dao.ProductDao;
import com.sample.postgress.entity.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao prodcutDao;

	@Override
	public List<Product> findAll() {
		return prodcutDao.findAll();
	}

	@Override
	public void addAProduct(Product pro) {
		prodcutDao.addAProduct(pro);
		
	}

	@Override
	public void updateProdut(Product pro) {
		prodcutDao.updateProdut(pro);
		
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
