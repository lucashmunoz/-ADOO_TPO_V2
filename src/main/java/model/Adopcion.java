package model;

import java.sql.Date;

import dto.AdopcionDTO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Adopcion{
	@Getter
	private static List<Adopcion> adopciones = new ArrayList<>();

	private Animal animal;
	private Cliente cliente;
	private LocalDateTime fechaAdopcion;
	private Usuario veterinario;
	private SeguimientoDomiciliario seguimientoDomiciliario;

	public static void crearAdopcion(Adopcion adopcion){
			adopciones.add(adopcion);
	}
}
