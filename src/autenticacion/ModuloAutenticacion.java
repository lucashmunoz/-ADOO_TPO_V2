package autenticacion;

import dto.UsuarioDTO;

public class ModuloAutenticacion implements AdapterAutentificacion {
	public UsuarioDTO traerDatosUsuario(String username)
	{
		return new UsuarioDTO();
	}
}
