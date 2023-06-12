package notificador_cliente;


import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import model.Animal;

@Setter
@Getter
public class NotificadorCliente {

  private static NotificadorCliente instance = new NotificadorCliente();

  private NotificadorCliente (){
  }

  public static NotificadorCliente getInstance(){
    return instance;
  }

  public void verificarFechaRecordatorio() {
    for (Animal animal : Animal.getAnimales()) {

      if (animal.getFichaTecnica().getSeguimientoDomiciliario().getFechaProximaVisita()
          .plusDays(animal.getFichaTecnica().getSeguimientoDomiciliario().getDiasAnticipacionRecordatorio())
          .isBefore(LocalDateTime.now().plusDays(1L))) {

        var notificacion = new NotificacionCliente();
        notificacion.setEmailDestinatario(animal.getFichaTecnica().getDueno().getEmail());
        notificacion.setTelefonoDestinatario(animal.getFichaTecnica().getDueno().getTelefono());
        notificacion.setEmailRemitente("refugio@puppies.com");
        notificacion.setTelefonoRemitente("11436758490");
        notificacion.setMensaje("Faltan " + animal.getFichaTecnica().getSeguimientoDomiciliario().getPreferenciasRecordatorio() + " para tu próxima visita.");
        enviarNotificacion(notificacion, animal.getFichaTecnica().getSeguimientoDomiciliario().getPreferenciasRecordatorio());
      }
    }
  }

  public void enviarNotificacion(NotificacionCliente notificacion, EstrategiaDeNotificacion estrategiaDeNotificacion) {
      estrategiaDeNotificacion.enviar(notificacion);
  }

}
