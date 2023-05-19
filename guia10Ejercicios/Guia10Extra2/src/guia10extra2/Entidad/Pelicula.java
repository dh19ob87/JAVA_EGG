/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Entidad;

import java.time.Duration;
/**
 *
 * @author diego
 */
public class Pelicula {
    private String titulo;
    private Duration minutos;
    private int edadMinima;
    private String director;
    
    public Pelicula(){}

    public Pelicula(String titulo, Duration minutos, int edadMinima, String director) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Duration getDuracionEnHoras() {
        return minutos;
    }

    public void setDuracionEnHoras(Duration duracionEnHoras) {
        this.minutos = duracionEnHoras;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionEnHoras=" + minutos.toHours() + " horas, edadMinima=" + edadMinima + ", director=" + director + '}';
    }
}
