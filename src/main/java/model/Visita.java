package model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Visita {
	private Visitador visitador;
	private LocalDateTime fecha;
	private String comentario;
	private EstadoAmbiente ambiente;
}
