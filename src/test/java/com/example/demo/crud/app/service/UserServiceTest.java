package com.example.demo.crud.app.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.crud.app.entity.UserEntity;
import com.example.demo.crud.app.repository.UserRepository;

public class UserServiceTest {

	private UserService userService;
	@Mock
	private UserRepository userRepository;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.userService = new UserService(userRepository);
	}

	@Test
	public void createUserTest() {
		UserEntity userEntity = new UserEntity();

		when(this.userRepository.save(userEntity)).thenReturn(userEntity);
		UserEntity response = this.userService.createUser(userEntity);
		assertNotNull(response);
	}

	@Test
	public void getuserAllTest() {
		List<UserEntity> listEntity = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		listEntity.add(userEntity);

		when(this.userRepository.findAll()).thenReturn(listEntity);
		List<UserEntity> response = this.userService.getuserAll();
		assertNotNull(response);
	}

	@Test
	public void updateUserTest() {
		UserEntity userEntity = new UserEntity();
		Integer id = 1;

		when(this.userRepository.save(userEntity)).thenReturn(userEntity);
		UserEntity response = this.userService.updateUser(userEntity, id);
		assertNotNull(response);

	}

	@Test
	public void deleteUserTest() {
		Integer id = 1;
		this.userService.deleteUser(id);
	}

	@Test
	public void getUserById() {
		Integer id = 1;

		UserEntity userEntity = new UserEntity();
		Optional<UserEntity> userEntityOpt = Optional.of(userEntity);

		when(this.userRepository.findById(id)).thenReturn(userEntityOpt);
		UserEntity response = this.userService.getUserById(id);
		assertNotNull(response);
	}

}
