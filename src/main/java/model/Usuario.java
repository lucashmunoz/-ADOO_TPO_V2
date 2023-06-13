package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	@Getter
	private static List<Usuario> usuarios = new ArrayList<>();

	private String username;
	TipoUsuario tipoUsuario;
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String numTelefono;

	public static Optional<Usuario> getDatosUsuarioByUsername(String username) {
		return usuarios.stream().filter(v -> v.getUsername().equals(username))
				.findFirst();
	}

	public static void crearUsuario(Usuario usuario){
		usuarios.add(usuario);
	}

}
