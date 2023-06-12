package dto;

import alarma.Accion;
import alarma.TipoAlarma;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import model.Animal;

@Getter
@Setter
public class AlarmaDTO {

  private Animal animal;
  private TipoAlarma tipoAlarma;
  private int periodicidadDias;
  private List<Accion> acciones;
  private String descripcion;

}
