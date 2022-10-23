package com.tbe.application.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbe.application.entities.Order;
import com.tbe.application.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	OrderService orderService ;
	
	@GetMapping
	ResponseEntity<List<Order>> findAll(){
		List<Order> userResponse = orderService.findAll();
		return ResponseEntity.ok().body(userResponse);
	}
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Order> findById(@PathVariable Long id){
		Order userResponse = orderService.findById(id);
		return ResponseEntity.ok().body(userResponse);
	}
	
	
	
	

}
