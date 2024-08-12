package com.curso.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	

}
