package controller;

import java.util.Optional;
import java.util.stream.Collectors;
import model.Animal;

public class ControllerAnimal {
	private static ControllerAnimal instance = new ControllerAnimal();
	private ControllerAnimal() {}
	public static ControllerAnimal getInstance() {return instance;}

	public void mostrarAnimalesRefugio(){
		Animal.getAnimales()
				.forEach(a -> System.out.println("Legajo: " + a.getLegajo() + " Tipo animal: " + a.getFichaTecnica().getTipoAnimal() + " Dueño: " + a.getFichaTecnica().getDueno() + " Es adpotable: " + !a.isEsSalvaje() + " Está bajo tratamiento: " + a.isEstaBajoTratamiento()));
	}

	public Optional<Animal> getAnimalByLegajo(String legajo){
		return Animal.getAnimales().stream().filter(a -> a.getLegajo().equals(legajo)).findFirst();
	}

	public boolean obtenerAnimalesAVisitar(){
		var animales = Animal.getAnimales().stream().filter(a -> a.getFichaTecnica().getDueno() != null).collect(
				Collectors.toList());
		animales.forEach(System.out::println);

		if(animales.isEmpty()){
			System.out.println("No hay animales en el refugio que puedan ser visitados.");
			return false;
		}

		return true;

	}

}
