package main;

import controller.ControllerUsuario;
import java.util.Scanner;
import model.Veterinario;
import model.Visitador;

public class Main {

  private static ControllerUsuario controllerUsuario = ControllerUsuario.getInstance();

  public static void main(String[] args) {
    cargarDatos();
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese su nombre de usuario para loguearse: ");
    String entradaUsuario = s.nextLine();
    controllerUsuario.traerDatos(entradaUsuario);


  }

  private static void cargarDatos() {

    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario1", "Juan", "Perez", "33456102", "juanperez1988@gmail.com",
            "1132456789"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario2", "María", "López", "44567890", "marialopez@gmail.com",
            "1123456789"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario3", "Carlos", "González", "55678901",
            "carlosgonzalez@gmail.com", "1145678901"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario4", "Laura", "Rodríguez", "66789012",
            "laurarodriguez@gmail.com", "1167890123"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario5", "Luis", "Gómez", "77890123", "luisgomez@gmail.com",
            "1189012345"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario6", "Ana", "Torres", "88901234", "anatorres@gmail.com",
            "1112345678"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario7", "Pedro", "Sánchez", "99012345", "pedrosanchez@gmail.com",
            "1134567890"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario8", "Marta", "Ramírez", "00123456", "martaramirez@gmail.com",
            "1156789012"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario9", "Sofía", "Hernández", "11234567",
            "sofiahernandez@gmail.com", "1178901234"));
    Veterinario.getVeterinarios().add(
        new Veterinario("veterinario10", "Daniel", "Fernández", "22345678",
            "danielfernandez@gmail.com", "1101234567"));

    Visitador.getVisitadores().add(
        new Visitador("visitador1", "Pedro", "Gómez", "33451122", "pedrogomez@example.com",
            "1122334455"));
    Visitador.getVisitadores().add(
        new Visitador("visitador2", "María", "Hernández", "44552233", "mariahernandez@example.com",
            "2233445566"));
    Visitador.getVisitadores().add(
        new Visitador("visitador3", "Carlos", "López", "55663344", "carloslopez@example.com",
            "3344556677"));
    Visitador.getVisitadores().add(
        new Visitador("visitador4", "Laura", "Martínez", "66774455", "lauramartinez@example.com",
            "4455667788"));
    Visitador.getVisitadores().add(
        new Visitador("visitador5", "Luisa", "González", "77885566", "luisagonzalez@example.com",
            "5566778899"));
    Visitador.getVisitadores().add(
        new Visitador("visitador6", "Ana", "Rodríguez", "88996677", "anarodriguez@example.com",
            "6677889900"));
    Visitador.getVisitadores().add(
        new Visitador("visitador7", "Pablo", "Sánchez", "99007788", "pablosanchez@example.com",
            "7788990011"));
    Visitador.getVisitadores().add(
        new Visitador("visitador8", "Marta", "Fernández", "00118899", "martafernandez@example.com",
            "8899001122"));
    Visitador.getVisitadores().add(
        new Visitador("visitador9", "Sofía", "López", "11229900", "sofialopez@example.com",
            "9900112233"));
    Visitador.getVisitadores().add(
        new Visitador("visitador10", "Daniel", "Ramírez", "22330011", "danielramirez@example.com",
            "0011223344"));


  }

}
