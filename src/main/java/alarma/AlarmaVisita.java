package alarma;

import dto.NotificacionPushDTO;
import model.Visitador;

public class AlarmaVisita extends Alarma {
	private Visitador visitador;
	public void cambiarEstadoAlarma(EstadoAlarma estadoAlarma) {}
	public Visitador getVisitador(){return visitador;}
	public void ejecutarAlarma(){
		notificadorPushAdapter.notificar(
				new NotificacionPushDTO("Tienes que "+this.getUltimaAccion().getAccionARealizar()
						,this.getVisitador().getNumTelefono()
						,this.getUltimaAccion().getComentario()
				)
		);
	}
}
