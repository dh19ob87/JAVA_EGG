/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Servicio;

import guia10extra3.Entidad.Persona;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashSet;

/**
 *
 * @author diego
 */
public class PersonaServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private static HashSet<Persona> personasRegistradas = new HashSet<>();

    public Persona crearPersona() {
        System.out.println("Por favor ingrese el nombre, apellido, DNI, email, direccion y número celular del cliente:");
        Persona cliente = new Persona(INPUT.next(), INPUT.next(), INPUT.nextLong(), INPUT.next(), INPUT.next(), INPUT.nextInt());
        personasRegistradas.add(cliente);
        return cliente;
    }

    public void imprimitDatosPersona(Persona person) {
        System.out.println(person.toString());
    }

    public void imprimirPersonasRegistradas() {
        if (personasRegistradas.isEmpty()) {
            System.out.println("No hay personas titulares de pólizas registradas en el sistema.");
        } else {
            personasRegistradas.forEach(System.out::println);
        }
    }
}
