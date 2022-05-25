package com.example.demo.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.crud.app.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
