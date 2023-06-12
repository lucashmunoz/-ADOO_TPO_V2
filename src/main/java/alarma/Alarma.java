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
	private Usuario atendidaPor;
	private Animal animal;
	private TipoAlarma tipoAlarma;
	private int periodicidadDias;
	private LocalDateTime ultimaEjecucionAlarma;
	private List<Accion> acciones;
	private EstadoAlarma estadoAlarma;
	private String descripcion;
	private NotificadorPushAdapter notificadorPushAdapter;


	public void atenderAlarma(EstadoAlarma estadoAlarma, Usuario usuario) {
		this.estadoAlarma = estadoAlarma;
		this.atendidaPor = usuario;
	}

}
