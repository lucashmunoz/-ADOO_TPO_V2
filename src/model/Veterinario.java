package model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Veterinario extends Usuario{
  @Getter
  private static List<Veterinario> veterinarios = new ArrayList<>();


  public Veterinario(String username, String nombre, String apellido, String dni, String email,
      String numTelefono) {
    super(username, nombre, apellido, dni, email, numTelefono);
  }
}
