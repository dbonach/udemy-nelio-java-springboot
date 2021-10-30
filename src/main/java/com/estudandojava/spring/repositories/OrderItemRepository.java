package com.estudandojava.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
