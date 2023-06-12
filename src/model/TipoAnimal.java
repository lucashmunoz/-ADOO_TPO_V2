package model;

public enum TipoAnimal {
	PERRO("perro"),
	GATO("gato"),
	CONEJO("conejo"),
	CABALLO("caballo"),
	HAMSTER("hamster"),
	GALLINA("gallina"),
	PAJARO("pajaro"),
	TORTUGA("tortuga"),
	PEZ("pez"),
	SERPIENTE("serpiente");
	
	String nombre;
	
	TipoAnimal(String nombre) {
		this.nombre = nombre;
	}

}
