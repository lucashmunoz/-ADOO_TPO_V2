package notificador_cliente;

public class NotificacionPorEmail implements EstrategiaDeNotificacion {

	private AdapterNotificacionEmail adapter;
	
	public void enviar(NotificacionCliente notificacion) {
		System.out.println("Se envió notificación por email.");
	}

}
