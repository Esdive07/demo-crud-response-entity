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

//actualizar
	@PutMapping("/{id}")
	public ResponseEntity<DireccionEntity> updateDireccion(@RequestBody DireccionEntity direccionEntity,
			@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(this.direccionService.updateDireccion(direccionEntity, id));

	}

//eliminar
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDireccion(@PathVariable Integer id) {
		this.direccionService.deleteDireccion(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

//consultar uno
	@GetMapping("/{id}")
	public ResponseEntity<DireccionEntity> getUserId(@PathVariable Integer id) {
		return ResponseEntity.ok(this.direccionService.getUserId(id));
	}
}
