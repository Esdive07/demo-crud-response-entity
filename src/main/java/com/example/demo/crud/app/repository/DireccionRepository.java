package com.example.demo.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.crud.app.entity.DireccionEntity;

public interface DireccionRepository extends JpaRepository<DireccionEntity, Integer> {

}
