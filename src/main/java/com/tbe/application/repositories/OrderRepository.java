package com.tbe.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbe.application.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	Order findById(Long id);

	void save(Order setPayment);
}
