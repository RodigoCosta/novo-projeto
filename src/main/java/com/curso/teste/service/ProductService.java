package com.curso.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.teste.entities.Product;
import com.curso.teste.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prodRepository;
	
	public List<Product> findAll(){
		return prodRepository.findAll();
	}
	
	public Product findByID(Long id) {
		Optional<Product> obj = prodRepository.findById(id);
		return obj.get();
	}
	

}
