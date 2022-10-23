package com.tbe.application.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbe.application.entities.Category;
import com.tbe.application.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	ResponseEntity<List<Category>> findAll(){
		List<Category> category = categoryService.findAll();
		return ResponseEntity.ok().body(category);
	}
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Category> findById(@PathVariable Long id){
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}
	
	
	
	

}
