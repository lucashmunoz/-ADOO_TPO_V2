package controller;

import alarma.AlarmaSeguimiento;
import autenticacion.AdapterAutentificacion;
import dto.UsuarioDTO;
import java.util.Optional;
import model.SeguimientoMedico;
import model.Usuario;
import model.Veterinario;
import model.Visita;
import model.Visitador;

public class ControllerUsuario {

  private static final ControllerUsuario instance = new ControllerUsuario();
  private AdapterAutentificacion adapter;

  public ControllerUsuario() {
  }

  public static ControllerUsuario getInstance() {
    return instance;
  }

  public Usuario traerDatos(String username) {
    Optional<Veterinario> veterinario = Veterinario.getVeterinarios().stream()
        .filter(v -> v.getUsername().equals(username))
        .findFirst();
    Optional<Visitador> visitador = Visitador.getVisitadores().stream()
        .filter(v -> v.getUsername().equals(username)).findFirst();

    if(veterinario.isPresent()){
      System.out.println(veterinario.get().getNombre() + " " + veterinario.get().getApellido() + " se ha logueado al sistema." );
      return veterinario.get();
    }

    if(visitador.isPresent()){
      System.out.println(visitador.get().getNombre() + " " + visitador.get().getApellido() + " se ha logueado al sistema." );
      return visitador.get();
    }

    System.out.println("No se han encontrado datos para el usuario " + username);
    return null;
  }

  public void realizarVisita(Visita visita) {
  }

  public void realizarSeguimiento(AlarmaSeguimiento alarmaSeguimiento,
      SeguimientoMedico seguimientoMedico) {
  }
}
