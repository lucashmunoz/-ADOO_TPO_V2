package alarma.notificador;

import dto.NotificacionPushDTO;

public interface NotificadorPushAdapter {
	public void notificar(NotificacionPushDTO notificacion);
}
