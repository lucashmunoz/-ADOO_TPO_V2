package model;

import java.util.List;

import notificador_cliente.NotificacionCliente;
import notificador_cliente.NotificadorCliente;

public class SeguimientoDomiciliario {
	private int cadenaVisitas;
	private NotificadorCliente preferenciasRecordatorio;
	private int diasAnticipacionRecordatorio;
	private List<Visita> visitas;
	
	public void enviarNotificacion(NotificacionCliente notificacion) {}
}
