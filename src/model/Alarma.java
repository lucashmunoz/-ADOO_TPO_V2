package model;

import java.sql.Date;
import java.util.List;

public abstract class Alarma {
	private Animal animal;
	private int periodicidadDias;
	private Date ultimaEjecucionAlarma;
	private List<Accion> acciones;
	private EstadoAlarma estadoAlarma;
	private EstrategiaAlarma estrategiaAlarma;
	private String descripcion;
	
	public void cambiarEstadoAlarma(EstadoAlarma estadoAlarma) {}
	
	public void setEstrategiaAlarma(EstrategiaAlarma estrategiaAlarma) {}
}
