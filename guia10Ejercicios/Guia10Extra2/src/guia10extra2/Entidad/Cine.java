/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Entidad;

import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class Cine {
    private Pelicula peliculaReproduciendo;
    private ArrayList <Sala> salas;
    private double precioEntrada;
    
    public Cine (){}

    public Cine(Pelicula peliculaReproduciendo, ArrayList<Sala> salas, double precioEntrada) {
        this.peliculaReproduciendo = peliculaReproduciendo;
        this.salas = salas;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPeliculaReproduciendo() {
        return peliculaReproduciendo;
    }

    public void setPeliculaReproduciendo(Pelicula peliculaReproduciendo) {
        this.peliculaReproduciendo = peliculaReproduciendo;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "peliculaReproduciendo=" + peliculaReproduciendo + ", salas=" + salas + ", precioEntrada=" + precioEntrada + '}';
    }
}
