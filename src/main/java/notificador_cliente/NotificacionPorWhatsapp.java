package notificador_cliente;

public class NotificacionPorWhatsapp implements EstrategiaDeNotificacion {

	private AdapterNotificacionWhatsapp adapter;
	
	public void enviar(NotificacionCliente notificacion) {
		System.out.println("Se envió notificación por WhatsApp.");
	}

}
