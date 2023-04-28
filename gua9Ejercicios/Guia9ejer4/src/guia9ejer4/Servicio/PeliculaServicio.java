/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer4.Servicio;

import guia9ejer4.Entidad.Pelicula;
import guia9ejer4.Utilidades.Comparadores;
import java.util.Collections;
import java.util.Stack;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author diego
 */
public class PeliculaServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ENGLISH);

    public Stack<Pelicula> crearPeliculas() {
        Stack<Pelicula> movies = new Stack<>();
        int salir;
        do {
            System.out.println("Por favor ingrese el título, director y duración de la película, respectivamente. (Recuerde que la duración se indica en horas)");
            movies.push(new Pelicula(INPUT.next(), INPUT.next(), INPUT.nextInt()));
            System.out.println("¡Película registrada con éxito!");
            System.out.println("¿Desea agregar otra película? 1. Sí | 0. No");
            salir = INPUT.nextInt();
        } while (salir != 0);

        return movies;
    }
    
    public void ordenarPeliculasPorHorasAsc(Stack<Pelicula> movies){
        Collections.sort(movies, Comparadores.ordenarPeliculasPorDuracionAsc);
        imprimirPeliculas(movies);
    }
    
    public void ordenarPeliculasPorHorasDesc(Stack<Pelicula> movies){
        Collections.sort(movies, Comparadores.ordenarPeliculasPorDuracionDesc);
        imprimirPeliculas(movies);
    }
    
    public void ordenarPeliculasPorTituloAsc (Stack<Pelicula> movies){
        Collections.sort(movies, Comparadores.ordenarPeliculasPorTituloAsc);
        imprimirPeliculas(movies);
    }
    
    public void ordenarPeliculasPorTituloDesc (Stack<Pelicula> movies){
        Collections.sort(movies, Comparadores.ordenarPeliculasPorTituloDesc);
        imprimirPeliculas(movies);
    }
    
    public void ordenasPeliculasPorAutorAsc (Stack<Pelicula> movies){
        Collections.sort(movies, Comparadores.ordenasPeliculasPorDirectorAsc);
        imprimirPeliculas(movies);
    }
    
    public void ordenasPeliculasPorAutorDesc (Stack<Pelicula> movies){
        Collections.sort(movies, Comparadores.ordenasPeliculasPorDirectorDesc);
        imprimirPeliculas(movies);
    }
    
    public void imprimirPeliculasMayoresAunaHora(Stack<Pelicula> movies){
        movies.forEach(pelicula -> {
            if(pelicula.getHoras() >= 1){
                System.out.println(pelicula.toString());
            }
        });
    }

    public void imprimirPeliculas(Stack<Pelicula> movies) {
        movies.forEach(pelicula -> System.out.println(pelicula.toString()));
    }
}
