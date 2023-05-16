/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10ejercicio1;

import guia10ejercicio1.Entidad.Perro;
import guia10ejercicio1.Entidad.Persona;
import guia10ejercicio1.Enumerable.RazasCanes;
import guia10ejercicio1.Servicio.PersonaServicio;
/**
 *
 * @author diego
 */
public class Guia10Ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio ps = new PersonaServicio();
        Persona peopleA = ps.crearPersona();
        Persona peopleB = ps.crearPersona();
        System.out.println(peopleA.toString());
        System.out.println(peopleB.toString());
    }
    
}
