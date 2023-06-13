package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

	public static void agregarAnimal(Animal animal){
		animales.add(animal);
	}

	public static void mostrarAnimalesRefugio(){
		animales.forEach(a -> System.out.println("Legajo: " + a.getLegajo() + " Tipo animal: " + a.getFichaTecnica().getTipoAnimal() + " Dueño: " + a.getFichaTecnica().getDueno() + " Es adpotable: " + !a.isEsSalvaje() + " Está bajo tratamiento: " + a.isEstaBajoTratamiento()));
	}

	public static Optional<Animal> getAnimalByLegajo(String legajo){
		return animales.stream().filter(a -> a.getLegajo().equals(legajo)).findFirst();
	}


}
