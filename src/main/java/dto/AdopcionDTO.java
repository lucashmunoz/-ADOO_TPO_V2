package dto;

import java.sql.Date;

import model.Animal;
import model.Cliente;
import model.SeguimientoDomiciliario;
import model.Veterinario;

public class AdopcionDTO {
	private Animal animal;
	private Cliente cliente;
	private Date fechaAdopcion;
	private String comentario;
	private Veterinario veterinario;
	private SeguimientoDomiciliario seguimientoDomiciliario;
}
