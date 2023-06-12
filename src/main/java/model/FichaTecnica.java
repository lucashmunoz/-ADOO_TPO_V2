package model;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FichaTecnica {
	private TipoAnimal tipoAnimal;
	private float altura;
	private float peso;
	private int edad;
	private boolean condicionMedicaOk;
	private Cliente dueno;
	private List<TratamientoMedico> tratamientosMedicos;
	private SeguimientoDomiciliario seguimientoDomiciliario;
	public FichaTecnica(TipoAnimal tipoAnimal, float altura, float peso, int edad, boolean condicionMedicaOk){
			this.tipoAnimal = tipoAnimal;
			this.altura = altura;
			this.peso = peso;
			this.edad = edad;
			this.condicionMedicaOk = condicionMedicaOk;
			this.tratamientosMedicos = new ArrayList<>();
	}

	public void agregarTratamientoMedico(TratamientoMedico tratamientoMedico){
		this.tratamientosMedicos.add(tratamientoMedico);
	}

}
