package com.curso.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
