package model;

import java.sql.Date;

import dto.AdopcionDTO;

public class Adopcion {
	private Animal animal;
	private Cliente cliente;
	private Date fechaAdopcion;
	private String comentario;
	private Veterinario veterinario;
	private SeguimientoDomiciliario seguimientoDomiciliario;
	
	public void crearAdopcion(AdopcionDTO adopcionDTO) {}
}
