package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
public class Cliente {

  //Lista estatica que simula una tabla en una base de datos
  @Getter
  private static List<Cliente> clientes = new ArrayList<>();

  private String dni;
  private String nombre;
  private String apellido;
  private String estadoCivil;
  private String email;
  private String telefono;
  private String ocupacion;
  private boolean otrasMascotas;
  private String motivoAdopcion;
  private List<TipoAnimal> animalesInteresados;
  private List<Animal> mascotas;

  public Cliente(String dni, String nombre, String apellido, String estadoCivil, String email,
      String telefono,
      String ocupacion, boolean otrasMascotas, String motivoAdopcion,
      List<TipoAnimal> animalesInteresados) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.estadoCivil = estadoCivil;
    this.email = email;
    this.telefono = telefono;
    this.ocupacion = ocupacion;
    this.otrasMascotas = otrasMascotas;
    this.motivoAdopcion = motivoAdopcion;
    this.animalesInteresados = animalesInteresados;
    this.mascotas = new ArrayList<>();
  }

  public String toString(){
    return this.nombre + " " + this.apellido;
  }

  public static void agregarCliente(Cliente cliente){
    clientes.add(cliente);
  }

  public static Optional<Cliente> getClienteByDNI(String dni){
    return clientes.stream().filter(c -> c.getDni().equals(dni)).findFirst();
  }

  public static void mostrarClientes() {
    clientes.forEach(c -> System.out.println("DNI: " + c.getDni() + " Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Tiene otras mascotas: " + c.isOtrasMascotas() ));
  }

}
