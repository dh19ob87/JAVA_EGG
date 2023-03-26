/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer13.Servicio;
import javapooeggexer13.Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CursoServicio {
    public Curso crearCurso (){
        String nombreCurso;
        int cantidadHorasPorDia;
        int cantidadDiasPorSemana;
        int turno;
        double precioPorHora;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese el nombre del curso");
        nombreCurso = input.next();
        System.out.println("Por favor ingrese la cantidad de horas por día impartidas.");
        cantidadHorasPorDia = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de dias por semana que se imparte el curso");
        cantidadDiasPorSemana = input.nextInt();
        do {
            System.out.println("Por favor ingrese el número correspondiente al turno en que se imparte el curso: 1 -> mañana, 2 -> tarde");
            turno = input.nextInt();
        } while (turno != 1 && turno != 2);
        System.out.println("Por favor indique el precio por hora del curso");
        precioPorHora = input.nextDouble();
        System.out.println("Por favor ingrese los nombres de los alumnos del curso.");
        
        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, cargarAlumnos(input));
    }
    
    public String[] cargarAlumnos (Scanner input){
        String [] nombresAlumnos = new String [5];
        Arrays.setAll(nombresAlumnos, (i) -> {
            System.out.println("Por favor ingrese el nombre del alumno " + (i+1));
            return input.next();
        });
        return nombresAlumnos;
    }
    
    public void calcularGananciaSemanal(Curso course){
        System.out.printf("La ganancia semanal del curso %s = %f COP \n", course.getNombreCurso(), (course.getPrecioPorHora() * course.getCantidadHorasPorDia() * course.getCantidadDiasPorSemana() * course.getAlumnos().length));
    }
    
    public void mostrarDataCourse (Curso course){
        System.out.println(course.toString());
    }
}
