package autenticacion;

import dto.UsuarioDTO;

public interface AdapterAutentificacion {
	public UsuarioDTO traerDatosUsuario(String username);
}