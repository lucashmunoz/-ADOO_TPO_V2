package alarma;

import java.time.LocalDateTime;
import model.Usuario;

public class AlarmaNoAtendida implements EstadoAlarma {

	private LocalDateTime fecha;
	private Usuario usuarioAtendido;

	public void atenderAlarma(Alarma alarma, Usuario user) {
		this.fecha = LocalDateTime.now();
		this.usuarioAtendido = user;
		alarma.setEstadoAlarma(new AlarmaAtendida());
	}
}
