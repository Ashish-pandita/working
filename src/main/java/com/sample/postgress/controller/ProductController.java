package com.sample.postgress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.entity.Product;
import com.sample.postgress.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductServiceImpl productService;

	@GetMapping
	public List<Product> findAll() {
		return productService.findAll();
	}

	@PostMapping
	public String addAProduct(@RequestBody Product pro) {
		productService.addAProduct(pro);
		return "done";
		
	}

	public void updateProdut(Product pro) {
		productService.updateProdut(pro);
		
	}
	
	public void executeUpdateProduct(Product pro) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteProduct(Product pro) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
	
