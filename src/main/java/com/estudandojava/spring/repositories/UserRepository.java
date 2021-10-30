package com.estudandojava.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
