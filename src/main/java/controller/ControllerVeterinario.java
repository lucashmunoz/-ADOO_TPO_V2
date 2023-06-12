package controller;

import dto.AnimalDTO;
import model.Animal;
import model.FichaTecnica;


public class ControllerVeterinario {

  public static ControllerVeterinario instance = new ControllerVeterinario();

  private ControllerVeterinario() {

  }

  public static ControllerVeterinario getInstance() {
    return instance;
  }

  public void ingresarAnimal(AnimalDTO dto) {
    Animal.getAnimales().add(new Animal(
        new FichaTecnica(dto.getTipoAnimal(), dto.getAltura(), dto.getPeso(), dto.getEdad(),
            dto.isCondicionMedicaOk()), dto.getFechaIngreso(), dto.isEsSalvaje(), dto.isEstaBajoTratamiento()));
  }

}
