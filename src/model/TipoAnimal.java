package model;

public enum TipoAnimal {
	PERRO("perro"),
	GATO("gato"),
	CONEJO("conejo"),
	CABALLO("caballo"),
	HAMSTER("hamster"),
	GALLINA("gallina");
	
	String nombre;
	
	TipoAnimal(String nombre) {
		this.nombre = nombre;
	}

}
