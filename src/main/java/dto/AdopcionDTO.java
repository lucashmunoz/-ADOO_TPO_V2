package dto;

import java.sql.Date;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Animal;
import model.Cliente;
import model.SeguimientoDomiciliario;
import model.Veterinario;

@Getter
@Setter
@NoArgsConstructor
public class AdopcionDTO {
	private Animal animal;
	private Cliente cliente;
	private LocalDateTime fechaAdopcion;
	private Veterinario veterinario;
}
