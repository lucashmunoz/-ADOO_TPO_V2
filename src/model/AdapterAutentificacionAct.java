package model;

import dto.UsuarioDTO;

public class AdapterAutentificacionAct implements AdapterAutentificacion {
	public UsuarioDTO traerDatosUsuario(String username)
	{
		return new UsuarioDTO();
	}
}
