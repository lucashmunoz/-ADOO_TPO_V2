package alarma;

import dto.NotificacionPushDTO;
import java.time.LocalDateTime;
import java.util.List;
import alarma.notificador.NotificadorPushAdapter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import model.Animal;
import model.Usuario;

@Setter
@Getter
@ToString
public  class Alarma {
	private Animal animal;
	private TipoAlarma tipoAlarma;
	private int periodicidadDias;
	private LocalDateTime ultimaEjecucionAlarma;
	private List<Accion> acciones;
	private EstadoAlarma estadoAlarma;
	private String descripcion;
	private NotificadorPushAdapter notificadorPushAdapter;


	public void atenderAlarma(Usuario usuario) {
		this.estadoAlarma.atenderAlarma(this, usuario);
	}

	public void notificar(NotificacionPushDTO dto){
		notificadorPushAdapter.notificar(dto);
	}

}
