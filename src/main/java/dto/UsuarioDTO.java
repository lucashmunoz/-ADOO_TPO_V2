package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.TipoUsuario;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioDTO {
	private String username;
	private TipoUsuario tipoUsuario;
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String numTelefono;
	
}
