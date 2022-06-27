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

import com.example.demo.crud.app.entity.DireccionEntity;
import com.example.demo.crud.app.service.DireccionService;

public class DireccionControllerTest {

	private DireccionController direccionController;
	@Mock
	private DireccionService direccionService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.direccionController = new DireccionController(direccionService);

	}

	@Test
	public void createDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();

		when(this.direccionService.createDireccion(direccionEntity)).thenReturn(direccionEntity);
		ResponseEntity<DireccionEntity> response = this.direccionController.createDireccion(direccionEntity);
		assertNotNull(response);
	}

	@Test
	public void getDireccionAll() {
		List<DireccionEntity> listDirection = new ArrayList<>();

		when(this.direccionService.getDireccionAll()).thenReturn(listDirection);
		ResponseEntity<List<DireccionEntity>> response = this.direccionController.getDireccionAll();
		assertNotNull(response);
	}

	@Test
	public void updateDireccionTest() {
		DireccionEntity direccionEntity = new DireccionEntity();
		Integer id = 1;

		when(this.direccionService.updateDireccion(direccionEntity, id)).thenReturn(direccionEntity);
		ResponseEntity<DireccionEntity> response = this.direccionController.updateDireccion(direccionEntity, id);
		assertNotNull(response);
	}

	@Test
	public void deleteDireccionTest() {
		Integer id = 1;
		this.direccionController.deleteDireccion(id);
	}

	@Test
	public void getDireccionId() {
		Integer id = 1;
		DireccionEntity direccionEntity = new DireccionEntity();

		when(this.direccionService.getUserId(id)).thenReturn(direccionEntity);
		ResponseEntity<DireccionEntity> response = this.direccionController.getDireccionId(id);
		assertNotNull(response);
	}
}
