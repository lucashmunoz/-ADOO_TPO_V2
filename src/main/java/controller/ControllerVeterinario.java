package controller;


import alarma.Accion;
import alarma.TipoAlarma;
import dto.AdopcionDTO;
import dto.AlarmaDTO;
import dto.AnimalDTO;
import dto.SeguimientoDomiciliarioDTO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import model.Adopcion;
import model.Animal;
import model.FichaTecnica;
import model.SeguimientoDomiciliario;
import model.Veterinario;
import utils.Utils;


public class ControllerVeterinario {

  public static ControllerVeterinario instance = new ControllerVeterinario();

  public static ControllerAlarma controllerAlarma = ControllerAlarma.getInstance();

  private ControllerVeterinario() {

  }

  public static ControllerVeterinario getInstance() {
    return instance;
  }

  public void ingresarAnimal(AnimalDTO dto) {
    Animal.getAnimales().add(new Animal(dto.getLegajo(),
        new FichaTecnica(dto.getTipoAnimal(), dto.getAltura(), dto.getPeso(), dto.getEdad(),
            dto.isCondicionMedicaOk()), dto.getFechaIngreso(), dto.isEsSalvaje(),
        dto.isEstaBajoTratamiento()));
  }


  public boolean validarAdopcion(AdopcionDTO dto) {
    if (dto.getAnimal().isEsSalvaje()) {
      System.out.println("Este animal no puede ser adoptado ya que es salvaje.");
      return false;
    }

    if (dto.getAnimal().getFichaTecnica().getDueno() != null) {
      System.out.println("Este animal ya tiene dueño.");
      return false;
    }

    if (dto.getAnimal().isEstaBajoTratamiento()) {
      System.out.println("Este animal no puede ser adoptado porque se encuentra bajo tratamiento.");
      return false;
    }

    if (dto.getCliente().getMascotas().size() >= 2) {
      System.out.println(
          "Este cliente no puede tener más de dos mascotas. Por lo tanto no puede realizar la adopción.");
      return false;
    }

    return true;

  }


  public void crearAdopcion(AdopcionDTO dto, SeguimientoDomiciliarioDTO seguimientoDTO) {

    /*
    SeguimientoDomiciliario seguimientoDomiciliario = new SeguimientoDomiciliario(
        Integer.parseInt(seguimientoDTO.getCadenciaVisitas()), seguimientoDTO.getPreferenciasRecordatorio(),
        Integer.parseInt(seguimientoDTO.getDiasAnticipacionRecordatorio()), LocalDateTime.now().plusSeconds(1));
    */

    SeguimientoDomiciliario seguimientoDomiciliario = new SeguimientoDomiciliario(
        1, seguimientoDTO.getPreferenciasRecordatorio(),
        1, LocalDateTime.now().plusSeconds(1));

    dto.getAnimal().getFichaTecnica().setSeguimientoDomiciliario(seguimientoDomiciliario);
    Adopcion.getAdopciones().add(
        new Adopcion(dto.getAnimal(), dto.getCliente(), LocalDateTime.now(),
            dto.getVeterinario(), seguimientoDomiciliario));

    dto.getAnimal().getFichaTecnica().setDueno(dto.getCliente());
    dto.getCliente().getMascotas().add(dto.getAnimal());
    dto.getAnimal().getFichaTecnica().setSeguimientoDomiciliario(seguimientoDomiciliario);
    System.out.println("El cliente " + dto.getCliente().getNombre() + " " + dto.getCliente().getApellido() + " ha adoptado al animal con legajo: " + dto.getAnimal().getLegajo() + ".");

    var alarma = new AlarmaDTO();
    alarma.setAnimal(dto.getAnimal());
    alarma.setAcciones(new ArrayList<>());
    alarma.setPeriodicidadDias(dto.getAnimal().getFichaTecnica().getSeguimientoDomiciliario().getDiasAnticipacionRecordatorio());
    var accion = new Accion();
    accion.setAccionARealizar("Realizar visita.");
    accion.setComentario("Visita domiciliaria.");
    alarma.getAcciones().add(accion);
    alarma.setDescripcion("Alarma de visita.");
    alarma.setTipoAlarma(TipoAlarma.VISITA);

    controllerAlarma.crearAlarma(alarma);
    System.out.println("Se ha generado la alarma para la visita.");

  }

  public Optional<Veterinario> getVeterinarioByUsername(String username) {
    return Veterinario.getVeterinarios().stream().filter(v -> v.getUsername().equals(username))
        .findFirst();
  }


  public boolean validarSeguimientoDomiciliario(SeguimientoDomiciliarioDTO dto) {

    if (!Utils.isInteger(dto.getCadenciaVisitas())) {
      System.out.println("Ingrese un valor válido para la cadencia de visitas.");
      return false;
    }

    if (!Utils.isInteger(dto.getDiasAnticipacionRecordatorio())) {
      System.out.println("Ingrese un valor válido para la anticipacion del recordatorio.");
      return false;
    }

    return true;
  }


}
