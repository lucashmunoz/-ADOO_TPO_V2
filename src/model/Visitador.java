package model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Visitador extends Usuario {
  @Getter
  private static List<Visitador> visitadores = new ArrayList<>();;

  public Visitador(String username, String nombre, String apellido, String dni, String email, String numTelefono){
    super(username, nombre, apellido, dni, email, numTelefono);
  }
	
}
