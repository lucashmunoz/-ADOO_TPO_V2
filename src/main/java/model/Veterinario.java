package model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veterinario extends Usuario {

  @Getter
  private static List<Veterinario> veterinarios = new ArrayList<>();


  public Veterinario(String username, TipoUsuario tipoUsuario, String nombre, String apellido,
      String dni, String email, String numTelefono) {
    super(username, tipoUsuario, nombre, apellido, dni, email, numTelefono);
  }
}
