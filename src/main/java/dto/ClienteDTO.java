package dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Animal;
import model.TipoAnimal;

@Getter
@AllArgsConstructor
public class ClienteDTO {
	private String dni;
	private String nombre;
	private String apellido;
	private String estadoCivil;
	private String email;
	private String telefono;
	private String ocupacion;
	private boolean otrasMascotas;
	private String motivoAdopcion;
	private List<TipoAnimal> animalesInteresados;

}
