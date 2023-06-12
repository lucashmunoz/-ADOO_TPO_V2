package controller;

import dto.AdopcionDTO;
import dto.ClienteDTO;
import java.util.Optional;
import model.Adopcion;
import model.Cliente;

public class ControllerCliente {

  private static ControllerCliente instance = new ControllerCliente();

  private ControllerCliente() {
  }

  public static ControllerCliente getInstance() {
    return instance;
  }

  public void crearCliente(ClienteDTO dto) {

    Cliente.getClientes().add(new Cliente(dto.getDni(), dto.getNombre(), dto.getApellido(), dto.getEstadoCivil(), dto.getEmail(), dto.getTelefono(), dto.getOcupacion(), dto.isOtrasMascotas(), dto.getMotivoAdopcion(), dto.getAnimalesInteresados()));

  }

  public void mostrarClientes() {
    Cliente.getClientes()
        .forEach(c -> System.out.println("DNI: " + c.getDni() + " Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Tiene otras mascotas: " + c.isOtrasMascotas() ));
  }

  public Optional<Cliente> getClienteByDNI(String dni){
    return Cliente.getClientes().stream().filter(c -> c.getDni().equals(dni)).findFirst();
  }

}
