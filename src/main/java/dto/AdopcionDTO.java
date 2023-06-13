package dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Adopcion;
import model.Animal;
import model.Cliente;
import model.Usuario;

@Getter
@Setter
@NoArgsConstructor
public class AdopcionDTO {
	private Animal animal;
	private Cliente cliente;
	private LocalDateTime fechaAdopcion;
	private Usuario veterinario;

}
