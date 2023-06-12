package dto;

import java.util.List;

import model.Animal;

public class ClienteDTO {
	private String nombre;
	private String apellido;
	private String estadoCivil;
	private String email;
	private String telefono;
	private String ocupacion;
	private boolean otrasMascotas;
	private String motivoAdopcion;
	private List<Animal> animalesInteresado;
	private List<Animal> mascotas;
}
