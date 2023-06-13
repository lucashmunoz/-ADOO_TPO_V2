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

    Cliente.agregarCliente(new Cliente(dto.getDni(), dto.getNombre(), dto.getApellido(), dto.getEstadoCivil(), dto.getEmail(), dto.getTelefono(), dto.getOcupacion(), dto.isOtrasMascotas(), dto.getMotivoAdopcion(), dto.getAnimalesInteresados()));

  }

  public void mostrarClientes() {
    Cliente.mostrarClientes();
  }

  public Optional<Cliente> getClienteByDNI(String dni){
    return Cliente.getClienteByDNI(dni);
  }

}
