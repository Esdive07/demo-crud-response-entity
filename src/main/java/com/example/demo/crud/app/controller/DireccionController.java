package com.example.demo.crud.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.app.entity.DireccionEntity;
import com.example.demo.crud.app.service.DireccionService;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

	private DireccionService direccionService;

	public DireccionController(DireccionService direccionService) {
		super();
		this.direccionService = direccionService;
	}

//crear
	@PostMapping
	public ResponseEntity<DireccionEntity> createDireccion(@RequestBody DireccionEntity direccionEntity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.direccionService.createDireccion(direccionEntity));

	}

//consultar
	@GetMapping
	public ResponseEntity<List<DireccionEntity>> getUserAll() {
		return ResponseEntity.ok(this.direccionService.getUserAll());

	}
}
