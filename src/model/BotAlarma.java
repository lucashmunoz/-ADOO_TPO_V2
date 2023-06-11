package model;

import java.util.List;

public class BotAlarma {
	private List<Alarma> alarmas;
	private static BotAlarma instance;
	private NotificadorPushAdapter notificadorPushAdapter;
	
	public void enviarNotificacion() {}
	public void verificarFechaAlarma() {}
	private BotAlarma() {}
	public static BotAlarma getInstance() {return new BotAlarma();}
	
}
