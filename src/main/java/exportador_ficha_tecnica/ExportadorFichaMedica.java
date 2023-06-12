package exportador_ficha_tecnica;

public class ExportadorFichaMedica {

	private static ExportadorFichaMedica instance = new ExportadorFichaMedica();

	private ExportadorFichaMedica(){

	}

	public static ExportadorFichaMedica getInstance(){
		return instance;
	}

	private EstrategiaDeExportacion estrategiaDeExportacion;
	
	public void exportar(ContenidoExportar contenidoExportar) {
		estrategiaDeExportacion.exportar(contenidoExportar);
	}
	public void cambiarEstrategia(EstrategiaDeExportacion nuevaEstrategia) {
		this.estrategiaDeExportacion = nuevaEstrategia;
	}
}
