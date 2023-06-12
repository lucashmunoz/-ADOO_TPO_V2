package dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Visitador;

@Getter
@Setter
@NoArgsConstructor
public class SeguimientoMedicoDTO {
  private LocalDateTime fecha;
  private String comentario;
  private Visitador visitador;

}
