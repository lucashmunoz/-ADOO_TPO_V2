package alarma;

import dto.NotificacionPushDTO;
import model.Veterinario;

public class AlarmaSeguimiento extends Alarma {
	private Veterinario veterinario;
	public void cambiarEstadoAlarma(EstadoAlarma estadoAlarma) {}
	public Veterinario getVeterinario(){return veterinario;}
	public void ejecutarAlarma(){
		notificadorPushAdapter.notificar(
				new NotificacionPushDTO("Tienes que "+this.getUltimaAccion().getAccionARealizar()
						,this.getVeterinario().getNumTelefono()
						,this.getUltimaAccion().getComentario()
				)
		);
	}
}
