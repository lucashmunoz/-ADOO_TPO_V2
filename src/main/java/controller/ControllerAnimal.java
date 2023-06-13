package controller;

import dto.AnimalDTO;
import java.util.Optional;
import java.util.stream.Collectors;
import model.Animal;
import model.FichaTecnica;

public class ControllerAnimal {
	private static ControllerAnimal instance = new ControllerAnimal();
	private ControllerAnimal() {}
	public static ControllerAnimal getInstance() {return instance;}

	public void mostrarAnimalesRefugio(){
		Animal.mostrarAnimalesRefugio();
	}

	public Optional<Animal> getAnimalByLegajo(String legajo){
		return Animal.getAnimalByLegajo(legajo);
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

	public void ingresarAnimal(AnimalDTO dto) {
		Animal.agregarAnimal(new Animal(dto.getLegajo(),
				new FichaTecnica(dto.getTipoAnimal(), dto.getAltura(), dto.getPeso(), dto.getEdad(),
						dto.isCondicionMedicaOk()), dto.getFechaIngreso(), dto.isEsSalvaje(),
				dto.isEstaBajoTratamiento()));
	}


}
