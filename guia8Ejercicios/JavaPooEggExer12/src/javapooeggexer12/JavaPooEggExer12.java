/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer12;
import javapooeggexer12.Entidad.Persona;
import javapooeggexer12.Servicio.PersonaServicio;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaPooEggExer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio peopleService = new PersonaServicio();
        Persona people = peopleService.crearPersona();
        peopleService.calcularEdad(people);
        System.out.println("¿Es menor? " + peopleService.menorQue(people, new Scanner(System.in).useDelimiter("\n").nextInt()));
        peopleService.mostrarPersona(people);
        peopleService.mostrarFechaNacimiento(people);
    }
    
}
