package model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "animal")
public class Animal {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id 
	@Column(name = "id", nullable = false)
	private long id;
	private String animal;
	private TipoAnimal tipoAnimal;
	private FichaTecnica fichaTecnica;
	private String origen;
	private LocalDateTime fechaIngreso;
	private boolean esSalvaje;
	private boolean estaBajoTratamiento;
	private static List<Animal> animales;
	
	public String setTipoAnimal() {
		return "";
	}
	
	public void crearAnimal() {
		
	}

}
