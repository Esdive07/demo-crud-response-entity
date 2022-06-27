package com.example.demo.crud.app.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityTest {

	private UserEntity userEntity;
	private DireccionEntity direccionEntity;

	@BeforeEach
	public void init() {
		this.userEntity = new UserEntity();
		this.direccionEntity = new DireccionEntity();
	}

	@Test
	public void userEntity() {
		Integer id = 1;
		String nombre = "ESME";
		String apellido = "DIAZ";
		Integer edad = 28;
		Integer documento = 1026;

		this.userEntity.setId(id);
		this.userEntity.setNombre(nombre);
		this.userEntity.setApellido(apellido);
		this.userEntity.setEdad(edad);
		this.userEntity.setDocumento(documento);

		assertEquals(id, this.userEntity.getId());
		assertEquals(nombre, this.userEntity.getNombre());
		assertEquals(apellido, this.userEntity.getApellido());
		assertEquals(edad, this.userEntity.getEdad());
		assertEquals(documento, this.userEntity.getDocumento());
	}

	@Test
	public void direccionEntityTest() {
		Integer id = 1;
		String calle = "General Ricardos";
		String localidad = "Carabanchel";
		String puerta = "1E";
		Integer codigoPostal = 28019;
		Integer numero = 69;

		this.direccionEntity.setId(id);
		this.direccionEntity.setCodigoPostal(codigoPostal);
		this.direccionEntity.setLocalidad(localidad);
		this.direccionEntity.setCalle(calle);
		this.direccionEntity.setNumero(numero);
		this.direccionEntity.setPuerta(puerta);

		assertEquals(id, this.direccionEntity.getId());
		assertEquals(codigoPostal, this.direccionEntity.getCodigoPostal());
		assertEquals(localidad, this.direccionEntity.getLocalidad());
		assertEquals(calle, this.direccionEntity.getCalle());
		assertEquals(numero, this.direccionEntity.getNumero());
		assertEquals(puerta, this.direccionEntity.getPuerta());

	}
}
