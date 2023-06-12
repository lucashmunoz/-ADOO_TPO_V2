package controller;

import exportador_ficha_tecnica.ContenidoExportar;
import exportador_ficha_tecnica.ExportadorFichaMedica;

public class ControllerFichaTecnica {
	private static ControllerFichaTecnica instance = new ControllerFichaTecnica();

	private ExportadorFichaMedica exportadorFichaMedica = ExportadorFichaMedica.getInstance();
	private ControllerFichaTecnica() {
	}
	public static ControllerFichaTecnica getInstance() 
	{ 
		return instance;
	}

	public void exportar(ContenidoExportar contenido){
		exportadorFichaMedica.exportar(contenido);
	}

}
