package model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import notificador_cliente.NotificacionCliente;
import notificador_cliente.NotificadorCliente;

@Getter
public class SeguimientoDomiciliario {
	private int cadenciaVisitas;
	private NotificadorCliente preferenciasRecordatorio;
	private int diasAnticipacionRecordatorio;
	private List<Visita> visitas;

	public SeguimientoDomiciliario(int cadenciaVisitas, NotificadorCliente preferenciasRecordatorio, int diasAnticipacionRecordatorio){
		this.cadenciaVisitas = cadenciaVisitas;
		this.preferenciasRecordatorio = preferenciasRecordatorio;
		this.diasAnticipacionRecordatorio = diasAnticipacionRecordatorio;
		this.visitas = new ArrayList<>();
	}

	public void enviarNotificacion(NotificacionCliente notificacion) {}
}
