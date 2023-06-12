package alarma;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import alarma.notificador.NotificadorPushAdapter;
import dto.NotificacionPushDTO;
import model.Animal;

public abstract class Alarma {
	private Animal animal;
	private int periodicidadDias;
	private LocalDateTime ultimaEjecucionAlarma;
	private List<Accion> acciones;
	private EstadoAlarma estadoAlarma;
	private String descripcion;
	protected NotificadorPushAdapter notificadorPushAdapter;
	public abstract void ejecutarAlarma();
	public void cambiarEstadoAlarma(EstadoAlarma estadoAlarma) {
		this.estadoAlarma = estadoAlarma;
	}
	public LocalDateTime getUltimaEjecucionAlarma(){ return ultimaEjecucionAlarma;}
	public void setUltimaEjecucionAlarma(LocalDateTime uja){
		ultimaEjecucionAlarma = uja;
	}
	public Accion getUltimaAccion(){return acciones.get(acciones.size());}
	public int getPeriodicidadDias(){return periodicidadDias;}
}
