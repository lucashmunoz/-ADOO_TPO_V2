package dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.TipoAnimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimalDTO {
  private TipoAnimal tipoAnimal;
  private float altura;
  private float peso;
  private int edad;
  private boolean condicionMedicaOk;
  private LocalDateTime fechaIngreso;
  private boolean esSalvaje;
  private boolean estaBajoTratamiento;

}
