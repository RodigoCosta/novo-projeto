package com.curso.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	


}
