package notificador_cliente;

public class NotificacionPorSMS implements EstrategiaDeNotificacion {
	private AdapterNotificacionSMS adapter;
	
	public void enviar(NotificacionCliente notificacion) {
		System.out.println("Se envió notificación por SMS.");
	}
}
