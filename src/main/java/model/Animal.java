package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Animal {

	@Getter
	private static List<Animal> animales = new ArrayList<>();;
	private TipoAnimal tipoAnimal;
	private FichaTecnica fichaTecnica;
	private String origen;
	private LocalDateTime fechaIngreso;
	private boolean esSalvaje;
	private boolean estaBajoTratamiento;

}
