package com.example.demo.crud.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.crud.app.entity.UserEntity;
import com.example.demo.crud.app.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

//crear
	public UserEntity createUser(UserEntity userEntity) {
		return this.userRepository.save(userEntity);
	}

//consultar todos
	public List<UserEntity> getuserAll() {
		return this.userRepository.findAll();
	}

//actualizar
	public UserEntity updateUser(UserEntity userEntity, Integer id) {
		return this.userRepository.save(userEntity);
	}

//eliminar
	public void deleteUser(Integer id) {
		this.userRepository.deleteById(id);
	}

//Consultar por id
	public UserEntity getUserById(Integer id) {
		return this.userRepository.findById(id).get();
	}
}
