package alarma;

import java.sql.Date;

import model.Usuario;

public class AlarmaAtendida implements EstadoAlarma {

	private Date fecha;
	private Usuario usuarioAtendido;
	
	public void cambiarEstadoAlarma(Alarma alarma) {
			alarma.setEstadoAlarma(new AlarmaAtendida());
	}

}
