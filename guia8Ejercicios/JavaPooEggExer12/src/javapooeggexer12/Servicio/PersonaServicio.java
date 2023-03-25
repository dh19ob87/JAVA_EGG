/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer12.Servicio;
import java.time.LocalDate;
import java.time.Month;
import javapooeggexer12.Entidad.Persona;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author diego
 */
public class PersonaServicio {
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd - MM - yyyy");
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona (){
        String nombre;
        int dia, mes, anio;
        LocalDate fechaNacimiento;
        
        System.out.println("Por favor ingrese el nombre");
        nombre  = INPUT.next();
        System.out.println("Por favor ingrese la fecha de nacimiento. Dia, mes, año, respectivamente.. Ej (22 30 1987)");
        dia = INPUT.nextInt();
        mes = INPUT.nextInt();
        anio = INPUT.nextInt();
        fechaNacimiento = LocalDate.of(anio, Month.of(mes), dia);
        return new Persona(nombre, fechaNacimiento);
    }
    
    public void calcularEdad(Persona people){
        System.out.println("Edad: " + people.getEdad());
    }
    
    public boolean menorQue(Persona people, int edad){
        return (people.getEdad() < edad);
    }
    
    public void mostrarPersona(Persona people){
        System.out.println(people.toString());
    }
    
    public void mostrarFechaNacimiento (Persona people){
        System.out.println(people.getFechaNacimiento().format(formato));
    }
}
