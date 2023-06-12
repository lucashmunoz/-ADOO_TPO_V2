package dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.EstadoAmbiente;

@Getter
@Setter
@NoArgsConstructor
public class VisitaDTO {

  private LocalDateTime fecha;
  private String comentario;
  private EstadoAmbiente ambiente;

}
