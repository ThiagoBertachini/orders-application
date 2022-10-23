package com.tbe.application.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbe.application.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
   Product findById(Long id);

	void saveAll(List<Product> asList);
}
