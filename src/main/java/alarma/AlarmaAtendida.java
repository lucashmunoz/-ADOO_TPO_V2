package alarma;

import java.sql.Date;

import java.time.LocalDateTime;
import model.Usuario;

public class AlarmaAtendida implements EstadoAlarma {

	public void atenderAlarma(Alarma alarma, Usuario user) {
		System.out.println("La alarma ya fue atendida por otro usuario.");
	}

}
