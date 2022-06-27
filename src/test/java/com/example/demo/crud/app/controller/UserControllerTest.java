package com.example.demo.crud.app.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.example.demo.crud.app.entity.UserEntity;
import com.example.demo.crud.app.service.UserService;

public class UserControllerTest {

	private UserController userController;
	@Mock
	private UserService userService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.userController = new UserController(userService);
	}

	@Test
	public void createUserTest() {
		UserEntity userEntity = new UserEntity();

		when(this.userService.createUser(userEntity)).thenReturn(userEntity);

		ResponseEntity<UserEntity> response = this.userController.createUser(userEntity);
		assertNotNull(response);
	}

	@Test
	public void getuserAllTest() {
		List<UserEntity> listUser = new ArrayList<UserEntity>();

		when(this.userService.getuserAll()).thenReturn(listUser);
		ResponseEntity<List<UserEntity>> response = this.userController.getuserAll();
		assertNotNull(response);
	}

	@Test
	public void updateUserTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;
		when(this.userService.updateUser(userEntity, id)).thenReturn(userEntity);
		ResponseEntity<UserEntity> response = this.userController.updateUser(userEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteUser() {
		Integer id = 1;
		this.userController.deleteUser(id);
	}

	@Test
	public void getUserByIdTest() {
		Integer id = 1;
		UserEntity userEntity = new UserEntity();
		
		when(this.userService.getUserById(id)).thenReturn(userEntity);
		ResponseEntity<UserEntity> response = this.userController.getUserById(id);
		assertNotNull(response);
	}

}
