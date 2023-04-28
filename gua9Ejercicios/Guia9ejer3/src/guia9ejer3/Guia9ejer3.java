/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer3;

import guia9ejer3.Servicio.AlumnoServicio;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author diego
 */
public class Guia9ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ENGLISH);
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumnos();
        as.imprimirAlumnos();
        System.out.println("Por favor ingrese un nombre de estudiante a buscar");
        as.calcularPromedioEstudiante(input.next());
        System.out.println("------------Estudiantes ordenados por nombre asc-----------------");
        as.ordenarListaAsc();
        System.out.println("--------Desordenando------------");
        as.desordenarAlumnos();
        System.out.println("------------Estudiantes ordenados por nombre desc-----------------");
        as.ordenarListaDesc();
        System.out.println("--------Desordenando------------");
        as.desordenarAlumnos();
        System.out.println("------------------Ordenando notas cada estudiante asc----------------------");
        as.ordenarNotasEstudianteAsc();
        System.out.println("------------------Ordenando notas cada estudiante desc----------------------");
        as.ordenarNotasEstudianteDesc();
        System.out.println("-----------------Modificando nombre alumno-------------------------");
        System.out.println("Por favor ingrese el nombre del alumno a modificar");
        as.modificarNombreAlumno(input.next());
        System.out.println("----------------------Modificando nota alumno------------------------");
        System.out.println("Por favor ingrese, respectivamente, el nombre del alumno, la nueva nota a asignar y la nota [1 2 3] que va a reemplazar.");
        as.modificarNota(input.next(), input.nextInt(), input.nextInt());
    }
    
}
