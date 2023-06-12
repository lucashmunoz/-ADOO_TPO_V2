package controller;

import exportador_ficha_tecnica.ExportadorFichaMedica;

public class ControllerFichaTecnica {
	private static ControllerFichaTecnica instance = new ControllerFichaTecnica();

	private ExportadorFichaMedica exportadorFichaMedica;
	private ControllerFichaTecnica() {}
	public static ControllerFichaTecnica getInstance() 
	{ 
		return instance;
	}
}
