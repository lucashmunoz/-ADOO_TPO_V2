package notificador_cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacionCliente {
	private String emailRemitente;
	private String emailDestinatario;
	private String mensaje;
	private String telefonoRemitente;
	private String telefonoDestinatario;
}
