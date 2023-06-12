package model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Visita {
	private Visitador visitador;
	private LocalDateTime fecha;
	private String comentario;
	private EstadoAmbiente ambiente;
}
