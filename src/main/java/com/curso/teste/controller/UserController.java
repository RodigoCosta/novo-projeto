package com.curso.teste.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.teste.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
