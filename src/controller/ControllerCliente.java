package controller;

import dto.AdopcionDTO;
import model.Adopcion;

public class ControllerCliente {
	private static ControllerCliente instance;
	private ControllerCliente() {}
	public static ControllerCliente getInstance() {return instance;}
	public void crearAdopcion(AdopcionDTO adopcionDTO) {}
}
