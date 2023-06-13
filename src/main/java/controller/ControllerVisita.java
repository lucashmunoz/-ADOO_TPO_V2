package controller;

import dto.VisitaDTO;
import model.Animal;
import model.Usuario;
import model.Visita;
import utils.Utils;

public class ControllerVisita {

  public static ControllerVisita instance = new ControllerVisita();

  public static ControllerAnimal controllerAnimal = ControllerAnimal.getInstance();

  private ControllerVisita() {

  }

  public static ControllerVisita getInstance() {
    return instance;
  }


  public void realizarVisita(Usuario usuario, Animal animal, VisitaDTO dto){
    var visita = Utils.mapper.map(dto, Visita.class);
    visita.setVisitador(usuario);
    animal.getFichaTecnica().getSeguimientoDomiciliario().getVisitas().add(visita);
    System.out.println("La visita se ha realizado correctamente.");
  }

}
