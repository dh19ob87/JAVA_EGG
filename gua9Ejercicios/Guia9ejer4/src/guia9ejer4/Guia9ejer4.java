/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer4;

import guia9ejer4.Entidad.Pelicula;
import java.util.Stack;
import guia9ejer4.Servicio.PeliculaServicio;
/**
 *
 * @author diego
 */
public class Guia9ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaServicio ps = new PeliculaServicio();
        Stack<Pelicula> movies = ps.crearPeliculas();
        ps.imprimirPeliculas(movies);
        System.out.println("=========================");
        ps.imprimirPeliculasMayoresAunaHora(movies);
        System.out.println("=========================");
        ps.ordenarPeliculasPorHorasAsc(movies);
        System.out.println("=========================");
        ps.ordenarPeliculasPorHorasDesc(movies);
        System.out.println("=========================");
        ps.ordenarPeliculasPorTituloAsc(movies);
        System.out.println("=========================");
        ps.ordenarPeliculasPorTituloDesc(movies);
        System.out.println("=========================");
        ps.ordenasPeliculasPorAutorAsc(movies);
        System.out.println("=========================");
        ps.ordenasPeliculasPorAutorDesc(movies);
    }
    
}
