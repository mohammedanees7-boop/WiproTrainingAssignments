package com.wipro.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
