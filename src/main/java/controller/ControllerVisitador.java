package controller;

import alarma.Alarma;
import dto.SeguimientoDomiciliarioDTO;
import dto.SeguimientoMedicoDTO;
import dto.VisitaDTO;
import model.Animal;
import model.SeguimientoDomiciliario;
import model.SeguimientoMedico;
import model.Visita;
import model.Visitador;
import utils.Utils;

public class ControllerVisitador {

  public static ControllerVisitador instance = new ControllerVisitador();

  public static ControllerAnimal controllerAnimal = ControllerAnimal.getInstance();

  private ControllerVisitador() {

  }

  public static ControllerVisitador getInstance() {
    return instance;
  }


  public void atenderAlarma(Alarma alarma){

  }

  public void realizarVisita(Visitador visitador, Animal animal, VisitaDTO dto){
    var visita = Utils.mapper.map(dto, Visita.class);
    visita.setVisitador(visitador);
    animal.getFichaTecnica().getSeguimientoDomiciliario().getVisitas().add(visita);
  }


}
