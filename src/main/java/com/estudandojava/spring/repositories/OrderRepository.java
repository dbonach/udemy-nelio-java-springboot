package com.estudandojava.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
