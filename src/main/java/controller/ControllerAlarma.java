package controller;

import alarma.Alarma;
import alarma.AlarmaNoAtendida;
import alarma.BotAlarma;
import alarma.notificador.NotificadorPushFirebase;
import dto.AlarmaDTO;

public class ControllerAlarma {
	private static ControllerAlarma instance = ControllerAlarma.getInstance();
	private ControllerAlarma() {}
	public static ControllerAlarma getInstance() {return instance;}


	public void crearAlarma(AlarmaDTO dto){
		var alarma = new Alarma();
		alarma.setAnimal(dto.getAnimal());
		alarma.setEstadoAlarma(new AlarmaNoAtendida());
		alarma.setUltimaEjecucionAlarma(null);
		alarma.setDescripcion(dto.getDescripcion());
		alarma.setPeriodicidadDias(dto.getPeriodicidadDias());
		alarma.setNotificadorPushAdapter(new NotificadorPushFirebase());
		BotAlarma.getAlarmas().add(alarma);
	}






}
