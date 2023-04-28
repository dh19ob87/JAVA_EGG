/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer4.Utilidades;

import guia9ejer4.Entidad.Pelicula;
import java.util.Comparator;
/**
 *
 * @author diego
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarPeliculasPorTituloAsc = (Pelicula movie1, Pelicula movie2) -> movie1.getTitulo().compareTo(movie2.getTitulo());
    public static Comparator<Pelicula> ordenarPeliculasPorTituloDesc = (Pelicula movie1, Pelicula movie2) -> movie2.getTitulo().compareTo(movie1.getTitulo());
    public static Comparator<Pelicula> ordenarPeliculasPorDuracionAsc = (Pelicula movie1, Pelicula movie2) -> movie1.getHoras().compareTo(movie2.getHoras());
    public static Comparator<Pelicula> ordenarPeliculasPorDuracionDesc = (Pelicula movie1, Pelicula movie2) -> movie2.getHoras().compareTo(movie1.getHoras());
    public static Comparator<Pelicula> ordenasPeliculasPorDirectorAsc = (Pelicula movie1, Pelicula movie2) -> movie1.getDirector().compareTo(movie2.getDirector());
    public static Comparator<Pelicula> ordenasPeliculasPorDirectorDesc = (Pelicula movie1, Pelicula movie2) -> movie2.getDirector().compareTo(movie1.getDirector());
}
