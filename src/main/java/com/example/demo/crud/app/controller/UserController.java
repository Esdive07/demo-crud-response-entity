package com.example.demo.crud.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.app.entity.UserEntity;
import com.example.demo.crud.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	// crear
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
		// return this.userService.createUser(userEntity);
		// return new
		// ResponseEntity<UserEntity>(this.userService.createUser(userEntity),
		// HttpStatus.CREATED);
		return new ResponseEntity<>(this.userService.createUser(userEntity), HttpStatus.CREATED);
	}

	// consultar
	@GetMapping
	public ResponseEntity<List<UserEntity>> getuserAll() {
		return ResponseEntity.ok(this.userService.getuserAll());
	}

	// actualizar
	@PutMapping("/{id}")
	public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity, @PathVariable Integer id) {
		// return this.userService.updateUser(userEntity, id);
		return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.updateUser(userEntity, id));

	}

	// eliminar
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
		this.userService.deleteUser(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}

	// consulta por id
	@GetMapping("/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable Integer id) {
		return ResponseEntity.ok(this.userService.getUserById(id));
	}
}
