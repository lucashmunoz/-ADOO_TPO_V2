package alarma;

public class AlarmaNoAtendida implements EstadoAlarma {

	public void cambiarEstadoAlarma(Alarma alarma) {
		alarma.setEstadoAlarma(new AlarmaAtendida());
	}

}
