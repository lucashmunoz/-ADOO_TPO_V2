package main;

import alarma.BotAlarma;
import controller.ControllerAdopcion;
import controller.ControllerAnimal;
import controller.ControllerCliente;
import controller.ControllerFichaTecnica;
import controller.ControllerUsuario;
import controller.ControllerVisita;
import dto.AdopcionDTO;
import dto.AnimalDTO;
import dto.ClienteDTO;
import dto.SeguimientoDomiciliarioDTO;
import dto.UsuarioDTO;
import dto.VisitaDTO;
import exportador_ficha_tecnica.ContenidoExportar;
import exportador_ficha_tecnica.ExportarExcel;
import exportador_ficha_tecnica.ExportarPDF;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import model.Animal;
import model.Cliente;
import model.EstadoAmbiente;
import model.TipoAnimal;
import model.TipoUsuario;
import notificador_cliente.NotificacionPorEmail;
import notificador_cliente.NotificacionPorSMS;
import notificador_cliente.NotificacionPorWhatsapp;
import notificador_cliente.NotificadorCliente;

public class Main {

  private static ControllerUsuario controllerUsuario = ControllerUsuario.getInstance();

  private static ControllerAdopcion controllerAdopcion = ControllerAdopcion.getInstance();

  private static ControllerAnimal controllerAnimal = ControllerAnimal.getInstance();

  private static ControllerCliente controllerCliente = ControllerCliente.getInstance();

  private static BotAlarma botAlarma = BotAlarma.getInstance();

  private static NotificadorCliente notificadorCliente = NotificadorCliente.getInstance();

  private static ControllerFichaTecnica controllerFichaTecnica = ControllerFichaTecnica.getInstance();

  private static ControllerVisita controllerVisita = ControllerVisita.getInstance();
  private static final Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    cargarDatos();
    boolean entradaOk = false;
    while(!entradaOk) {
      var user = login();
      if (user.isPresent()) {
        if (user.get().getTipoUsuario().equals(TipoUsuario.VETERINARIO)) {
          menuVeterinario(user.get().getUsername());
        } else {
          menuVisitador(user.get().getUsername());
        }

      }
      System.out.println("Si desea salir del programa pulse 1, de lo contrario ingrese cualquier opción y podrá reloguearse.");
      String entradaUsuario = s.nextLine();
      if(entradaUsuario.equals("1")){
        entradaOk = true;
      }
      botAlarma.verificarFechaAlarma();
      notificadorCliente.verificarFechaRecordatorio();
    }

  }

  private static void cargarDatos() {

    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario1", TipoUsuario.VETERINARIO, "Juan", "Perez", "33456102",
            "juanperez1988@gmail.com",
            "1132456789"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario2", TipoUsuario.VETERINARIO, "María", "López", "44567890",
            "marialopez@gmail.com",
            "1123456789"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario3", TipoUsuario.VETERINARIO, "Carlos", "González", "55678901",
            "carlosgonzalez@gmail.com", "1145678901"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario4", TipoUsuario.VETERINARIO, "Laura", "Rodríguez", "66789012",
            "laurarodriguez@gmail.com", "1167890123"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario5", TipoUsuario.VETERINARIO, "Luis", "Gómez", "77890123",
            "luisgomez@gmail.com",
            "1189012345"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario6", TipoUsuario.VETERINARIO, "Ana", "Torres", "88901234",
            "anatorres@gmail.com",
            "1112345678"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario7", TipoUsuario.VETERINARIO, "Pedro", "Sánchez", "99012345",
            "pedrosanchez@gmail.com",
            "1134567890"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario8", TipoUsuario.VETERINARIO, "Marta", "Ramírez", "00123456",
            "martaramirez@gmail.com",
            "1156789012"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario9", TipoUsuario.VETERINARIO, "Sofía", "Hernández", "11234567",
            "sofiahernandez@gmail.com", "1178901234"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("veterinario10", TipoUsuario.VETERINARIO, "Daniel", "Fernández", "22345678",
            "danielfernandez@gmail.com", "1101234567"));

    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador1", TipoUsuario.VISITADOR, "Pedro", "Gómez", "33451122",
            "pedrogomez@example.com",
            "1122334455"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador2", TipoUsuario.VISITADOR, "María", "Hernández", "44552233",
            "mariahernandez@example.com",
            "2233445566"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador3", TipoUsuario.VISITADOR, "Carlos", "López", "55663344",
            "carloslopez@example.com",
            "3344556677"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador4", TipoUsuario.VISITADOR, "Laura", "Martínez", "66774455",
            "lauramartinez@example.com",
            "4455667788"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador5", TipoUsuario.VISITADOR, "Luisa", "González", "77885566",
            "luisagonzalez@example.com",
            "5566778899"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador6", TipoUsuario.VISITADOR, "Ana", "Rodríguez", "88996677",
            "anarodriguez@example.com",
            "6677889900"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador7", TipoUsuario.VISITADOR, "Pablo", "Sánchez", "99007788",
            "pablosanchez@example.com",
            "7788990011"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador8", TipoUsuario.VISITADOR, "Marta", "Fernández", "00118899",
            "martafernandez@example.com",
            "8899001122"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador9", TipoUsuario.VISITADOR, "Sofía", "López", "11229900",
            "sofialopez@example.com",
            "9900112233"));
    controllerUsuario.agregarUsuario(
        new UsuarioDTO("visitador10", TipoUsuario.VISITADOR, "Daniel", "Ramírez", "22330011",
            "danielramirez@example.com",
            "0011223344"));

    controllerAnimal.ingresarAnimal(
        new AnimalDTO("PERRO1", TipoAnimal.PERRO, 30.0f, 12.5f, 5, true,
            LocalDateTime.of(2022, 3, 15, 9, 30), false, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("GATO1", TipoAnimal.GATO, 25.0f, 8.2f, 4, true,
            LocalDateTime.of(2022, 4, 20, 14, 0), false, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("CONEJO1", TipoAnimal.CONEJO, 15.0f, 2.5f, 2, true,
            LocalDateTime.of(2022, 5, 10, 11, 15), false, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("PAJARO1", TipoAnimal.PAJARO, 10.0f, 0.2f, 1, true,
            LocalDateTime.of(2022, 6, 5, 16, 30), false, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("GALLINA1", TipoAnimal.GALLINA, 30.0f, 5.0f, 3, true,
            LocalDateTime.of(2022, 7, 25, 10, 45), false, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("TORTUGA1", TipoAnimal.TORTUGA, 20.0f, 1.0f, 5, true,
            LocalDateTime.of(2022, 8, 12, 14, 0), false, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("SERPIENTE1", TipoAnimal.SERPIENTE, 150.0f, 5.0f, 6, true,
            LocalDateTime.of(2022, 9, 18, 17, 15), true, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("HAMSTER1", TipoAnimal.HAMSTER, 5.0f, 0.1f, 1, true,
            LocalDateTime.of(2022, 10, 30, 13, 30), false, true));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("CABALLO1", TipoAnimal.CABALLO, 150.0f, 500.0f, 8, true,
            LocalDateTime.of(2022, 11, 8, 16, 45), true, false));
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("PEZ1", TipoAnimal.PEZ, 10.0f, 0.05f, 2, true,
            LocalDateTime.of(2022, 12, 5, 12, 0), false, false));

    controllerCliente.crearCliente(
        new ClienteDTO("33456721", "Juan", "Gómez", "Soltero", "juangomez@example.com",
            "1122334455", "Estudiante", true, "Amor y compañía",
            Arrays.asList(TipoAnimal.PERRO, TipoAnimal.GATO)));
    controllerCliente.crearCliente(
        new ClienteDTO("44567890", "María", "Hernández", "Casado", "mariahernandez@example.com",
            "2233445566", "Profesional", false, "Diversión y compañía",
            Arrays.asList(TipoAnimal.GATO, TipoAnimal.CONEJO)));
    controllerCliente.crearCliente(
        new ClienteDTO("55678901", "Carlos", "López", "Soltero", "carloslopez@example.com",
            "3344556677", "Empleado", true, "Compañía y protección",
            Arrays.asList(TipoAnimal.PERRO, TipoAnimal.PAJARO)));
    controllerCliente.crearCliente(
        new ClienteDTO("66789012", "Laura", "Martínez", "Casado", "lauramartinez@example.com",
            "4455667788", "Profesional", false, "Compañía y diversión",
            Arrays.asList(TipoAnimal.GATO, TipoAnimal.HAMSTER)));
    controllerCliente.crearCliente(
        new ClienteDTO("77890123", "Luisa", "González", "Soltero", "luisagonzalez@example.com",
            "5566778899", "Estudiante", true, "Compañía y amor",
            Arrays.asList(TipoAnimal.PERRO, TipoAnimal.CONEJO)));
    controllerCliente.crearCliente(
        new ClienteDTO("88901234", "Ana", "Rodríguez", "Casado", "anarodriguez@example.com",
            "6677889900", "Empleado", false, "Compañía y protección",
            Arrays.asList(TipoAnimal.GATO, TipoAnimal.TORTUGA)));
    controllerCliente.crearCliente(
        new ClienteDTO("90012345", "Pablo", "Sánchez", "Soltero", "pablosanchez@example.com",
            "7788990011", "Profesional", true, "Compañía y diversión",
            Arrays.asList(TipoAnimal.PERRO, TipoAnimal.SERPIENTE)));
    controllerCliente.crearCliente(
        new ClienteDTO("01123456", "Marta", "Fernández", "Casado", "martafernandez@example.com",
            "8899001122", "Empleado", false, "Amor y protección",
            Arrays.asList(TipoAnimal.GATO, TipoAnimal.HAMSTER)));
    controllerCliente.crearCliente(
        new ClienteDTO("12234567", "Sofía", "López", "Soltero", "sofialopez@example.com",
            "9900112233", "Estudiante", true, "Compañía y diversión",
            Arrays.asList(TipoAnimal.PERRO, TipoAnimal.PAJARO)));
    controllerCliente.crearCliente(
        new ClienteDTO("23345678", "Daniel", "Ramírez", "Casado", "danielramirez@example.com",
            "0011223344", "Profesional", false, "Compañía y protección",
            Arrays.asList(TipoAnimal.GATO, TipoAnimal.CONEJO)));
  }

  private static Optional<UsuarioDTO> login() {
    System.out.println("Ingrese su nombre de usuario para loguearse: ");
    String entradaUsuario = s.nextLine();
    return controllerUsuario.traerDatos(entradaUsuario);
  }

  private static void ingresarAnimalAlRefugio() {
    controllerAnimal.ingresarAnimal(
        new AnimalDTO("GATO2", TipoAnimal.GATO, 25.5f, 4.2f, 3, true,
            LocalDateTime.of(2022, 6, 10, 10, 0), false, true));
    controllerAnimal.mostrarAnimalesRefugio();
  }


  private static void darDeAltaAdopcion(String username) {
    boolean entradaOk = false;
    boolean datosOK = false;
    AdopcionDTO adopcionDTO = new AdopcionDTO();
    while (!datosOK) {
      while (!entradaOk) {
        System.out.println(
            "Seleccione un animal para adoptar ingresando su número de legajo tal cual está escrito: ");
        controllerAnimal.mostrarAnimalesRefugio();
        String entradaUsuario = s.nextLine();
        Optional<Animal> animal = controllerAnimal.getAnimalByLegajo(entradaUsuario);
        if (animal.isEmpty()) {
          System.out.println(
              "El número de legajo ingresado no existe en nuestra base de datos. Ingrese uno correcto.");
        } else {
          entradaOk = true;
          adopcionDTO.setAnimal(animal.get());
        }
      }
      entradaOk = false;
      while (!entradaOk) {
        System.out.println(
            "Seleccione el cliente que realizará la adopción ingresando su DNI:");
        controllerCliente.mostrarClientes();
        String entradaUsuario = s.nextLine();
        Optional<Cliente> cliente = controllerCliente.getClienteByDNI(entradaUsuario);
        if (cliente.isEmpty()) {
          System.out.println(
              "El número de DNI ingresado no existe en nuestra base de datos. Ingrese uno correcto.");
        } else {
          entradaOk = true;
          adopcionDTO.setCliente(cliente.get());
        }
      }
      adopcionDTO.setVeterinario(
          controllerUsuario.getDatosUsuarioByUsername(username).get());
      if(controllerAdopcion.validarAdopcion(adopcionDTO)){
        datosOK = true;
      }else{
        entradaOk = false;
      }
    }
    System.out.println("Los datos de la adopción fueron cargados correctamente. Se procede a crear el seguimiento domiciliario.");
    datosOK = false;
    entradaOk = false;
    SeguimientoDomiciliarioDTO seguimientoDomiciliarioDTO = new SeguimientoDomiciliarioDTO();
    while(!datosOK){
      while (!entradaOk){
        System.out.println("Ingrese el método de recordatorio preferido:\n1-SMS\n2-Email\n3-WhatsApp");
        String entradaUsuario = s.nextLine();
        if(entradaUsuario.equals("1")){
          seguimientoDomiciliarioDTO.setPreferenciasRecordatorio(new NotificacionPorSMS());
          entradaOk = true;
        }
        if(entradaUsuario.equals("2")){
          seguimientoDomiciliarioDTO.setPreferenciasRecordatorio(new NotificacionPorEmail());
          entradaOk = true;
        }
        if(entradaUsuario.equals("3")){
          seguimientoDomiciliarioDTO.setPreferenciasRecordatorio(new NotificacionPorWhatsapp());
          entradaOk = true;
        }
        if(!entradaUsuario.equals("1") && !entradaUsuario.equals("2") && !entradaUsuario.equals("3")){
          System.out.println("Ingrese una opción válida.");
        }
      }

      System.out.println("Ingrese la cadencia de las visitas (debe ingresar un número entero): ");
      seguimientoDomiciliarioDTO.setCadenciaVisitas(s.nextLine());

      System.out.println("Ingrese con cuántos días de anticipación desea recibir el recordatorio (debe ingresar un número entero): ");
      seguimientoDomiciliarioDTO.setDiasAnticipacionRecordatorio(s.nextLine());

      if(controllerAdopcion.validarSeguimientoDomiciliario(seguimientoDomiciliarioDTO)){
        datosOK = true;
        adopcionDTO.setFechaAdopcion(LocalDateTime.now());
        controllerAdopcion.crearAdopcion(adopcionDTO, seguimientoDomiciliarioDTO);
      }else
        entradaOk = false;
    }

  }

  private static void darDeAltaUnCliente() {
    controllerCliente.crearCliente(
        new ClienteDTO("98765432", "Ana", "López", "Casado", "analopez@example.com", "2233445566",
            "Estudiante", true, "Compañía y diversión",
            Arrays.asList(TipoAnimal.GATO, TipoAnimal.CONEJO)));
    controllerCliente.mostrarClientes();
  }

  private static void exportarFicha(){
    boolean entradaOk = false;
    while (!entradaOk) {
      System.out.println(
          "Seleccione el animal del que desea exportar su ficha técnica ingresando su número de legajo tal cual está escrito: ");
      controllerAnimal.mostrarAnimalesRefugio();
      String entradaUsuario = s.nextLine();
      Optional<Animal> animal = controllerAnimal.getAnimalByLegajo(entradaUsuario);
      if (animal.isEmpty()) {
        System.out.println(
            "El número de legajo ingresado no existe en nuestra base de datos. Ingrese uno correcto.");
      } else {
        var contenido = new ContenidoExportar();
        contenido.setContenido("DATOS");
        contenido.setPath("Desktop");
        while (!entradaOk){
          System.out.println("¿En qué formato desea exportar la ficha?:\n1-PDF\n2-Excel");
           entradaUsuario = s.nextLine();
          if(entradaUsuario.equals("1")){
            controllerFichaTecnica.exportar(contenido, new ExportarPDF());
            entradaOk = true;
          }
          if(entradaUsuario.equals("2")){
            controllerFichaTecnica.exportar(contenido, new ExportarExcel());
            entradaOk = true;
          }
          if(!entradaUsuario.equals("1") && !entradaUsuario.equals("2") ){
            System.out.println("Ingrese una opción válida.");
          }
        }

      }
    }

  }

  private static void menuVeterinario(String username) {
    System.out.println(
        "¿Qué desea hacer?\n1-Ingresar un animal al refugio\n2-Dar de alta una adopción\n3-Dar de alta un cliente\n4-Exportar Ficha Tecnica\n5-Salir");
    String entradaUsuario = s.nextLine();
    if (entradaUsuario.equals("1")) {
      ingresarAnimalAlRefugio();
    }
    if (entradaUsuario.equals("2")) {
      darDeAltaAdopcion(username);
      controllerAnimal.mostrarAnimalesRefugio();
    }

    if (entradaUsuario.equals("3")) {
      darDeAltaUnCliente();
    }

    if (entradaUsuario.equals("4")) {
      exportarFicha();
    }

    if (!entradaUsuario.equals("3") && !entradaUsuario.equals("2") && !entradaUsuario.equals("1")
        && !entradaUsuario.equals("4") && !entradaUsuario.equals("5")) {
      System.out.println("Ingrese una opción válida");
    }

  }

  private static void menuVisitador(String username) {
    System.out.println("¿Qué desea hacer?\n1-Visitar Animal\n4-Salir");
    String entradaUsuario = s.nextLine();
    if (entradaUsuario.equals("1")) {
      visitarAnimal(username);
    }
    if (entradaUsuario.equals("2")) {

    }

    if (entradaUsuario.equals("3")) {

    }


    if (!entradaUsuario.equals("3") && !entradaUsuario.equals("2") && !entradaUsuario.equals("1")) {
      System.out.println("Ingrese una opción válida");
    }
  }

  private static void visitarAnimal(String username){
    boolean entradaOk = false;
    while (!entradaOk) {
      System.out.println(
          "Seleccione el animal que desea visitar ingresando su número de legajo tal cual está escrito: ");
      boolean existe = controllerAnimal.obtenerAnimalesAVisitar();
      String entradaUsuario = s.nextLine();
      Optional<Animal> animal = controllerAnimal.getAnimalByLegajo(entradaUsuario);
      if (animal.isEmpty() && existe) {
        System.out.println(
            "El número de legajo ingresado no existe en nuestra base de datos. Ingrese uno correcto.");
      } else {
        entradaOk = true;
        if(existe){
          var visita = new VisitaDTO();
          visita.setFecha(LocalDateTime.now());
          visita.setAmbiente(EstadoAmbiente.BUENO);
          visita.setComentario("OK");
          controllerVisita.realizarVisita(controllerUsuario.getDatosUsuarioByUsername(username).get(), animal.get(), visita);
          System.out.println(animal.get().getFichaTecnica().getSeguimientoDomiciliario().getVisitas().get(animal.get().getFichaTecnica().getSeguimientoDomiciliario().getVisitas().size() -1));
        }
      }

    }

  }

}

