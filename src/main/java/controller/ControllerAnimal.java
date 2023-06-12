package controller;

public class ControllerAnimal {
	private static ControllerAnimal instance;
	private ControllerAnimal() {}
	public static ControllerAnimal getInstance() {return instance;}
}
