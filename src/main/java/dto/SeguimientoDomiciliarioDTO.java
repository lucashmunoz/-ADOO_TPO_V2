package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notificador_cliente.NotificadorCliente;

@Getter
@Setter
@NoArgsConstructor
public class SeguimientoDomiciliarioDTO {

  private String cadenciaVisitas;
  private NotificadorCliente preferenciasRecordatorio;
  private String diasAnticipacionRecordatorio;

}
