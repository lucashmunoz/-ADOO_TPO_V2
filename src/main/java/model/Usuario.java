package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Usuario {
	private String username;
	TipoUsuario tipoUsuario;
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String numTelefono;

}
