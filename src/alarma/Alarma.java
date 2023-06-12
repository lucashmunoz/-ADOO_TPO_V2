package alarma;

import java.sql.Date;
import java.util.List;

import model.Animal;

public abstract class Alarma {
	private Animal animal;
	private int periodicidadDias;
	private Date ultimaEjecucionAlarma;
	private List<Accion> acciones;
	private EstadoAlarma estadoAlarma;
	private String descripcion;
	
	public void cambiarEstadoAlarma(EstadoAlarma estadoAlarma) {}
	
}
