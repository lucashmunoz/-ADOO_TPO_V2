package autenticacion;

import dto.UsuarioDTO;
import java.util.Optional;

public interface AdapterAutentificacion {
	Optional<UsuarioDTO> traerDatosUsuario(String username);
}
