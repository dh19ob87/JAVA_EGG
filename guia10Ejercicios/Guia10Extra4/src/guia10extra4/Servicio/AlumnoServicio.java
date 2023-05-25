/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Servicio;

import guia10extra4.Entidad.Alumno;
/**
 *
 * @author diego
 */
public class AlumnoServicio {
    public Alumno crearAlumno(String nombres, String apellidos, Long dni, Integer votosObtenidos){
        return new Alumno(nombres, apellidos, dni, votosObtenidos);
    }
    
    public void printAlumno(Alumno student){
        System.out.println(student.toString());
    }
}
