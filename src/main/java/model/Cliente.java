package model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Cliente {

	//Lista estatica que simula una tabla en una base de datos
	@Getter
	private static List<Cliente> clientes = new ArrayList<>();;
	private String nombre;
	private String apellido;
	private String estadoCivil;
	private String email;
	private String telefono;
	private String ocupacion;
	private boolean otrasMascotas;
	private String motivoAdopcion;
	private List<TipoAnimal> animalesInteresados;
	private List<Animal> mascotas;
	
	public void crearCliente() {
		
	}
}
