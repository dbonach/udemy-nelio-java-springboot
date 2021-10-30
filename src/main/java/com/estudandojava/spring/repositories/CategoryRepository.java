package com.estudandojava.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
