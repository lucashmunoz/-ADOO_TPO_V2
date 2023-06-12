package controller;

import alarma.AlarmaSeguimiento;
import autenticacion.AdapterAutentificacion;
import dto.UsuarioDTO;
import model.SeguimientoMedico;
import model.Visita;

public class ControllerUsuario {
	private static ControllerUsuario instance;
	private AdapterAutentificacion adapter;
	
	private ControllerUsuario() {}
	public static ControllerUsuario getInstance() {return instance;}
	public UsuarioDTO traerDatos(String username) {return null;}
	public void realizarVisita(Visita visita) {}
	public void realizarSeguimiento(AlarmaSeguimiento alarmaSeguimiento, SeguimientoMedico seguimientoMedico) {}
}
