package autenticacion;

import dto.UsuarioDTO;
import java.util.Optional;
import model.Usuario;
import utils.Utils;


public class ModuloAutenticacion implements AdapterAutentificacion {

	public Optional<UsuarioDTO> traerDatosUsuario(String username) {

		var user = Usuario.getDatosUsuarioByUsername(username);

		if(user.isPresent()){
			System.out.println(user.get().getNombre() + " " + user.get().getApellido() + " se ha logueado al sistema." );
			return Optional.of(new UsuarioDTO(user.get().getUsername(), user.get().getTipoUsuario(), user.get().getNombre(),
					user.get().getApellido(), user.get().getDni(), user.get().getEmail(), user.get().getNumTelefono()));
		}

		System.out.println("No se han encontrado datos para el usuario " + username);
		return Optional.empty();
	}
}
