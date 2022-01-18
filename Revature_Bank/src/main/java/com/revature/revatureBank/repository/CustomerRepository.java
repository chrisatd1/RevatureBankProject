package com.revature.revatureBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.revatureBank.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
