package controller;

import alarma.AlarmaSeguimiento;
import autenticacion.AdapterAutentificacion;
import autenticacion.ModuloAutenticacion;
import dto.UsuarioDTO;
import java.util.Optional;
import model.SeguimientoMedico;
import model.TipoUsuario;
import model.Usuario;
import model.Veterinario;
import model.Visita;
import model.Visitador;
import utils.Utils;

public class ControllerUsuario {

  private static final ControllerUsuario instance = new ControllerUsuario();
  private AdapterAutentificacion adapter;

  public ControllerUsuario() {
    this.adapter = new ModuloAutenticacion();
  }

  public static ControllerUsuario getInstance() {
    return instance;
  }

  public Optional<UsuarioDTO> traerDatos(String username) {
    return adapter.traerDatosUsuario(username);
  }

  public void realizarVisita(Visita visita) {
  }

  public void realizarSeguimiento(AlarmaSeguimiento alarmaSeguimiento,
      SeguimientoMedico seguimientoMedico) {
  }
}
