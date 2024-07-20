package com.curso.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
