package alarma;

import dto.NotificacionPushDTO;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;


@Getter
public class BotAlarma {

  @Getter
  private static List<Alarma> alarmas;
  private static BotAlarma instance = new BotAlarma();

  public void enviarNotificacion(Alarma alarma) {
    alarma.getNotificadorPushAdapter().notificar(
        new NotificacionPushDTO("Tienes que " + alarma.getAcciones().get(alarma.getAcciones().size() - 1)
            ,alarma.getDescripcion()));

  }
  public void verificarFechaAlarma() {
    for (Alarma alarma : alarmas) {
      if (alarma.getUltimaEjecucionAlarma().plusDays(alarma.getPeriodicidadDias())
          .isBefore(LocalDateTime.now().plusDays(1L))) {
        enviarNotificacion(alarma);
      }
    }
  }
  private BotAlarma() {
  }

  public static BotAlarma getInstance() {
    return instance;
  }


}
