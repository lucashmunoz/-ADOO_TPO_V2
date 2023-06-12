package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.TipoUsuario;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDTO {
	private String username;
	private TipoUsuario tipoUsuario;
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String numTelefono;
	
}
