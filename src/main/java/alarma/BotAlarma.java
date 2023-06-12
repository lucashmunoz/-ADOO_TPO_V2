package alarma;

import java.time.LocalDateTime;
import java.util.List;

import alarma.notificador.NotificadorPushAdapter;
import dto.NotificacionPushDTO;

public class BotAlarma {
	private List<Alarma> alarmas;
	private static BotAlarma instance = new BotAlarma();
	
	public void enviarNotificacion(Alarma alarma) {
		alarma.ejecutarAlarma();
	}
	public void verificarFechaAlarma() {
		for(Alarma alarma : alarmas){
			if(alarma.getUltimaEjecucionAlarma().plusDays(alarma.getPeriodicidadDias()).isBefore(LocalDateTime.now().plusDays(1L)))
				enviarNotificacion(alarma);
		}
	}
	private BotAlarma() {}
	public static BotAlarma getInstance() {return new BotAlarma();}

	
}
