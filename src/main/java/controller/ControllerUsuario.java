package controller;

import autenticacion.AdapterAutentificacion;
import autenticacion.ModuloAutenticacion;
import dto.UsuarioDTO;
import java.util.Optional;
import model.SeguimientoMedico;
import model.Usuario;
import model.Visita;
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

  public void agregarUsuario(UsuarioDTO dto) {
    Usuario.crearUsuario(new Usuario(dto.getUsername(), dto.getTipoUsuario(), dto.getNombre(),
        dto.getApellido(), dto.getDni(), dto.getEmail(), dto.getNumTelefono()));
  }

  public Optional<Usuario> getDatosUsuarioByUsername(String username) {
    return Usuario.getDatosUsuarioByUsername(username);
  }
}
