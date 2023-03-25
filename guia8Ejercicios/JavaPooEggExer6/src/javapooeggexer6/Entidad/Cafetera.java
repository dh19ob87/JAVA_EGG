/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer6.Entidad;

/**
 *
 * @author diego
 */
public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;
    
    public Cafetera(){}
    
    public Cafetera (double capacidadMaxima, double cantidadActual){
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setCapaciadaMaxima (double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setCantidadActual (double cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
    public double getCapacidadMaxima (){
        return capacidadMaxima;
    }
    
    public double getCantidadActual (){
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
