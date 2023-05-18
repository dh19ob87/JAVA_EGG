/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Servicio;

import java.util.Scanner;
import java.time.Duration;
import java.util.Locale;
import guia10extra2.Entidad.Pelicula;
/**
 *
 * @author diego
 */
public class PeliculaServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Pelicula crearPelicula(){
        System.out.println("Por favor ingrese el titulo de la película, la duracion en minutos, edad mínima y nombre del director:");
        return new Pelicula(INPUT.next(), Duration.ofHours(INPUT.nextInt()), INPUT.nextInt(), INPUT.next());
    }
    
    public void imprimirDatosPelicula (Pelicula movie){
        System.out.println(movie.toString());
    }
}
