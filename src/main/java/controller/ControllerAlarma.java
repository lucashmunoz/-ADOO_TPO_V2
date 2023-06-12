package controller;

import alarma.Alarma;
import alarma.AlarmaAtendida;
import alarma.AlarmaNoAtendida;
import alarma.BotAlarma;
import alarma.notificador.NotificadorPushFirebase;
import dto.AlarmaDTO;
import java.time.LocalDateTime;
import model.Usuario;

public class ControllerAlarma {
	private static ControllerAlarma instance = new ControllerAlarma();
	private ControllerAlarma() {}
	public static ControllerAlarma getInstance() {return instance;}

	public void crearAlarma(AlarmaDTO dto){
		var alarma = new Alarma();
		alarma.setAnimal(dto.getAnimal());
		alarma.setTipoAlarma(dto.getTipoAlarma());
		alarma.setEstadoAlarma(new AlarmaNoAtendida());
		alarma.setUltimaEjecucionAlarma(LocalDateTime.now().minusDays(2));
		alarma.setDescripcion(dto.getDescripcion());
		alarma.setPeriodicidadDias(1);
		alarma.setNotificadorPushAdapter(new NotificadorPushFirebase());
		alarma.setAcciones(dto.getAcciones());
		BotAlarma.getAlarmas().add(alarma);
	}

	public void atenderAlarma(Alarma alarma, Usuario usuario){
		alarma.atenderAlarma(new AlarmaAtendida(), usuario);
	}



}
