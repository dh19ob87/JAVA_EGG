/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer3.Utilidades;

import java.util.Comparator;
import guia9ejer3.Entidad.Alumno;
/**
 *
 * @author diego
 */
public class Comparadores {
    
    public static Comparator <Alumno> ordenarAlumnosPorNombreAscendente = (Alumno t, Alumno t1) -> t.getNombre().compareTo(t1.getNombre());
    public static Comparator <Alumno> ordenarAlumnosPorNombreDescendente = (Alumno t1, Alumno t2) -> t2.getNombre().compareTo(t1.getNombre());
    public static Comparator <Integer> ordenarNotasAscendente = (Integer nota1, Integer nota2) -> nota1.compareTo(nota2);
    public static Comparator <Integer> ordenarNotasDescendente = (Integer nota1, Integer nota2) -> nota2.compareTo(nota1);
}
