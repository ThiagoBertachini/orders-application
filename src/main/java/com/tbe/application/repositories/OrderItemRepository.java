package com.tbe.application.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbe.application.entities.OrderItem;
import com.tbe.application.entities.User;


public interface OrderItemRepository extends JpaRepository<User, Long> {
	
	User findById(Long id);

	void saveAll(List<OrderItem> asList);
}
