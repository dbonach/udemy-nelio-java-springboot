package com.estudandojava.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
