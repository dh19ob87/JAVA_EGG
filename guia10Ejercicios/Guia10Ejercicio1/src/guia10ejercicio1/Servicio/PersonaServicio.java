/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio1.Servicio;

import guia10ejercicio1.Entidad.Persona;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PersonaServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Persona crearPersona (){
        PerroServicio perro = new PerroServicio();
        System.out.println("Por favor ingrese el nombre, apellido, edad, documento de la persona.");
        return new Persona(INPUT.next(), INPUT.next(), INPUT.nextInt(), INPUT.nextLong(), perro.crearMascota());
    }
}
