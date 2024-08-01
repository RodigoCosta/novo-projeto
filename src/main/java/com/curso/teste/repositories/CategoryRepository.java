package com.curso.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
