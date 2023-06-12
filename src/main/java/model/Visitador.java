package model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Visitador extends Usuario {
  @Getter
  private static List<Visitador> visitadores = new ArrayList<>();;

  public Visitador(String username, TipoUsuario tipoUsuario, String nombre, String apellido,
      String dni, String email, String numTelefono) {
    super(username, tipoUsuario, nombre, apellido, dni, email, numTelefono);
  }

}
