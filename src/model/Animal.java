package model;

import java.time.LocalDateTime;
import java.util.List;


public class Animal {

	private long id;
	private TipoAnimal tipoAnimal;
	private FichaTecnica fichaTecnica;
	private String origen;
	private LocalDateTime fechaIngreso;
	private boolean esSalvaje;
	private boolean estaBajoTratamiento;
	private static List<Animal> animales;
	
	public String setTipoAnimal() {
		String ta;
		ta = tipoAnimal.toString();
		return ta;
	}
	
	public void crearAnimal() {
	}

}
