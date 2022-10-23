package com.tbe.application.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbe.application.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findById(Long id);
	
	User save(User user);
	
	void deleteById(Long id);
}
