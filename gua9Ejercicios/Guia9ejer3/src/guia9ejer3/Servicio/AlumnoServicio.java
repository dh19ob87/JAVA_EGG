/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer3.Servicio;

import guia9ejer3.Entidad.Alumno;
import guia9ejer3.Utilidades.Comparadores;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author diego
 */
interface notesRegistry {

    LinkedList<Integer> agregarNotas(LinkedList<Integer> notes);
}

public class AlumnoServicio {

    private LinkedList<Alumno> students = new LinkedList<>();
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ENGLISH);

    public AlumnoServicio() {
    }

    public void crearAlumnos() {
        int salir = 0;

        notesRegistry notes = (elemento) -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Por favor ingrese la nota " + (i + 1));
                elemento.add(INPUT.nextInt());
            }
            return elemento;
        };

        do {
            System.out.println("Por favor ingrese el nombre del estudiante " + (students.size() + 1));
            students.add(new Alumno(INPUT.next(), notes.agregarNotas(new LinkedList<>())));
            System.out.println("¿Desea seguir registrando alumnos? 1. Sí | 0. No");
            salir = INPUT.nextInt();
        } while (salir != 0);

        System.out.println("Registro de alumnos y notas, respectivamente, completados.");
    }

    public void calcularPromedioEstudiante(String name) {

        Iterator<Alumno> iter = students.iterator();
        while (iter.hasNext()) {
            int promedio = 0;
            Alumno alumno = iter.next();
            if (alumno.getNombre().equalsIgnoreCase(name)) {
                for (Integer nota : alumno.getNotas()) {
                    promedio += nota;
                }
                System.out.printf("Promedio de %s es = %d \n", alumno.getNombre(), (promedio / alumno.getNotas().size()));
            }
        }
        if (!iter.hasNext()) {
            System.out.println("Estudiante no registrado en el sistema.");
        }
    }

    public void ordenarListaAsc() {
        Collections.sort(students, Comparadores.ordenarAlumnosPorNombreAscendente);
        imprimirAlumnos();
    }

    public void ordenarListaDesc() {
        Collections.sort(students, Comparadores.ordenarAlumnosPorNombreDescendente);
        imprimirAlumnos();
    }

    public void ordenarNotasEstudianteAsc() {
        students.forEach((estudiante) -> {
            Collections.sort(estudiante.getNotas(), Comparadores.ordenarNotasAscendente);
        });
        imprimirAlumnos();
    }

    public void ordenarNotasEstudianteDesc() {
        students.forEach((estudiante) -> {
            Collections.sort(estudiante.getNotas(), Comparadores.ordenarNotasDescendente);
        });
        imprimirAlumnos();
    }

    public void desordenarAlumnos() {
        Collections.shuffle(students);
        imprimirAlumnos();
    }

    public void imprimirAlumnos() {

        Iterator<Alumno> iter = students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

    }
    
    public void eliminarAlumno(String name){
        Iterator <Alumno> iter = students.iterator();
        while (iter.hasNext()) {
            Alumno next = iter.next();
            if(next.getNombre().equals(name)){
                iter.remove();
            }
        }
        imprimirAlumnos();
    }
    
    public void modificarNombreAlumno(String name){
        Iterator <Alumno> iter = students.iterator();
        while (iter.hasNext()) {
            Alumno next = iter.next();
            if(next.getNombre().equals(name)){
                System.out.println("Por favor ingrese el nuevo nombre del alumno");
                next.setNombre(INPUT.next());
            }
        }
        imprimirAlumnos();
    }
    
    public void modificarNota (String name, int nota, int notaIndex){
        Iterator <Alumno> iter = students.iterator();
        int notaPosicion;
        while (iter.hasNext()) {
            Alumno next = iter.next();
            if(next.getNombre().equals(name)){
                next.getNotas().set(notaIndex-1, nota);
            }
        }
        imprimirAlumnos();
    }
}
