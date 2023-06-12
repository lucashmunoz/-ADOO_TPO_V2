package dto;

import alarma.Accion;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import model.Animal;

@Getter
@Setter
public class AlarmaDTO {

  private Animal animal;
  private int periodicidadDias;
  private List<Accion> acciones;
  private String descripcion;

}
