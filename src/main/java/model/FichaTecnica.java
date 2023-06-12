package model;

import java.util.List;

import exportador_ficha_tecnica.ContenidoExportar;
import exportador_ficha_tecnica.ExportadorFichaMedica;

public class FichaTecnica {
	private Animal animal;
	private float altura;
	private float peso;
	private int edad;
	private boolean condicionMedica;
	private Cliente dueno;
	private List<TratamientoMedico> tratamientosMedicos;
	private SeguimientoDomiciliario seguimientoDomiciliario;
	private ExportadorFichaMedica exportadorFichaMedica;
	
	public void getAnimal(Animal animal) {}
	public void exportar(ContenidoExportar contenidoExportar) {
	}
}
