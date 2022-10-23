package com.tbe.application.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbe.application.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Category findById(Long id);

	void saveAll(List<Category> asList);
}
