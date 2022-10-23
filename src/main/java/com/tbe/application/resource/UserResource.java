package com.tbe.application.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tbe.application.entities.User;
import com.tbe.application.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> userResponse = userService.findAll();
		return ResponseEntity.ok().body(userResponse);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User userResponse = userService.findById(id);
		return ResponseEntity.ok().body(userResponse);
	}
	
	@PostMapping
	public ResponseEntity<User> save(@RequestBody User user){
		User userResponse = userService.save(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(userResponse.getId()).toUri();
		return ResponseEntity.created(uri).body(userResponse);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id){
		userService.deleteById(id);
		return ResponseEntity.noContent().build(); 
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> deleteById(@PathVariable Long id, @RequestBody User user){
		user = userService.update(id, user);
		return ResponseEntity.ok(user);
	}

}