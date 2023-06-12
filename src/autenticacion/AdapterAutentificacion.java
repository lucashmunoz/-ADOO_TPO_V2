package autenticacion;

import dto.UsuarioDTO;

public interface AdapterAutentificacion {
	 UsuarioDTO traerDatosUsuario(String username);
}
