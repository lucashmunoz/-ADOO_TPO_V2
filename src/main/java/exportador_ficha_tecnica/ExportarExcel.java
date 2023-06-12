package exportador_ficha_tecnica;

public class ExportarExcel implements EstrategiaDeExportacion {

	@Override
	public void exportar(ContenidoExportar contenido) {
		System.out.println("Exportado a Excel.");
	}

}