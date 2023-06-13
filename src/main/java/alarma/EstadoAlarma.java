package alarma;

import model.Usuario;

public interface EstadoAlarma {
	 void atenderAlarma(Alarma alarma, Usuario user);
}
