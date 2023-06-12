package dto;


public class NotificacionPushDTO {
	private String mensaje;
	private String telefono;
	private String descripcion;
	public NotificacionPushDTO(String msj, String tel, String desc){
		mensaje = msj;
		telefono = tel;
		descripcion = desc;
	}
}
