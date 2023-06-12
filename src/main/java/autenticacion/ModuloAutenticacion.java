package autenticacion;

import dto.UsuarioDTO;
import java.util.Optional;
import model.Veterinario;
import model.Visitador;
import utils.Utils;


public class ModuloAutenticacion implements AdapterAutentificacion {

	public Optional<UsuarioDTO> traerDatosUsuario(String username) {

		Optional<Veterinario> veterinario = Veterinario.getVeterinarios().stream()
				.filter(v -> v.getUsername().equals(username))
				.findFirst();
		Optional<Visitador> visitador = Visitador.getVisitadores().stream()
				.filter(v -> v.getUsername().equals(username)).findFirst();

		if(veterinario.isPresent()){
			System.out.println(veterinario.get().getNombre() + " " + veterinario.get().getApellido() + " se ha logueado al sistema." );
			return Optional.of(Utils.mapper.map(veterinario.get(), UsuarioDTO.class));
		}

		if(visitador.isPresent()){
			System.out.println(visitador.get().getNombre() + " " + visitador.get().getApellido() + " se ha logueado al sistema." );
			return Optional.of(Utils.mapper.map(visitador.get(), UsuarioDTO.class));
		}

		System.out.println("No se han encontrado datos para el usuario " + username);
		return Optional.empty();
	}
}
