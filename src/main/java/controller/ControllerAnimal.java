package controller;

import model.Animal;

public class ControllerAnimal {
	private static ControllerAnimal instance = new ControllerAnimal();
	private ControllerAnimal() {}
	public static ControllerAnimal getInstance() {return instance;}

	public void mostrarAnimalesRefugio(){
		Animal.getAnimales().forEach(System.out::println);
	}

}
