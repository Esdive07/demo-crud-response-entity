package com.example.demo.crud.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.crud.app.entity.DireccionEntity;
import com.example.demo.crud.app.repository.DireccionRepository;

@Service
public class DireccionService {

	private DireccionRepository direccionRepository;

	public DireccionService(DireccionRepository direccionRepository) {
		super();
		this.direccionRepository = direccionRepository;
	}

//crear
	public DireccionEntity createDireccion(DireccionEntity direccionEntity) {
		return this.direccionRepository.save(direccionEntity);
	}

//consultar
	public List<DireccionEntity> getUserAll() {
		return this.direccionRepository.findAll();
	}

}
