package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class Animal {

	//Lista estatica que simula una tabla en una base de datos
	@Getter
	private static List<Animal> animales = new ArrayList<>();
	private String legajo;
	private FichaTecnica fichaTecnica;
	private LocalDateTime fechaIngreso;
	private boolean esSalvaje;
	private boolean estaBajoTratamiento;

}
