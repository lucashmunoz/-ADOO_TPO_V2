package controller;

public class ControllerCliente {
	private static ControllerCliente instance;
	private ControllerCliente() {}
	public static ControllerCliente getInstance() {return instance;}
}
