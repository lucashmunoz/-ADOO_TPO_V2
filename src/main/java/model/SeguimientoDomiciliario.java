package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import notificador_cliente.EstrategiaDeNotificacion;
import notificador_cliente.NotificacionCliente;
import notificador_cliente.NotificadorCliente;

@Getter
public class SeguimientoDomiciliario {
	private int cadenciaVisitas;
	private EstrategiaDeNotificacion preferenciasRecordatorio;
	private int diasAnticipacionRecordatorio;

	private LocalDateTime fechaProximaVisita;
	private List<Visita> visitas;

	public SeguimientoDomiciliario(int cadenciaVisitas, EstrategiaDeNotificacion preferenciasRecordatorio, int diasAnticipacionRecordatorio, LocalDateTime fechaProximaVisita){
		this.cadenciaVisitas = cadenciaVisitas;
		this.preferenciasRecordatorio = preferenciasRecordatorio;
		this.diasAnticipacionRecordatorio = diasAnticipacionRecordatorio;
		this.fechaProximaVisita = fechaProximaVisita;
		this.visitas = new ArrayList<>();
	}

	public void enviarNotificacion(NotificacionCliente notificacion) {}
}
