package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notificador_cliente.EstrategiaDeNotificacion;

@Getter
@Setter
@NoArgsConstructor
public class SeguimientoDomiciliarioDTO {

  private String cadenciaVisitas;
  private EstrategiaDeNotificacion preferenciasRecordatorio;
  private String diasAnticipacionRecordatorio;

}
