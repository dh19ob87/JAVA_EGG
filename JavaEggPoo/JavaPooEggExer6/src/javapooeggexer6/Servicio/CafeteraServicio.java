/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer6.Servicio;

import java.util.Scanner;
import javapooeggexer6.Entidad.Cafetera;

/**
 *
 * @author diego
 */
public class CafeteraServicio {

    public static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        System.out.println("Por favor ingrese la capacidad máxima de la cafetera y la cantidad actual de café, respectivamente.");
        return new Cafetera(INPUT.nextDouble(), INPUT.nextDouble());
    }

    public void llenarCafetera(Cafetera coffee) {
        coffee.setCantidadActual(coffee.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera coffee, int tamanioTazaVacia) {
        if (coffee.getCantidadActual() == 0) {
            System.out.println("No hay café en la cafetera. Por favor llénela.");
        } else if (coffee.getCantidadActual() < tamanioTazaVacia) {
            System.out.printf("La cantidad actual no alcanzó para llenar la taza. Solo llenamos %f %% de la taza \n", ((coffee.getCantidadActual() / tamanioTazaVacia) * 100));
        }else{
            System.out.println("Se llenó la taza.");
        }

        coffee.setCantidadActual((coffee.getCantidadActual() == 0) ? 0 : (coffee.getCantidadActual() < tamanioTazaVacia) ? 0 : coffee.getCantidadActual() - tamanioTazaVacia);
    }
    
    public void vaciarCafetera(Cafetera coffee){
        coffee.setCantidadActual(0);
    }
    
    public void agregarCafé (Cafetera coffee, int cantidadCafe){
        coffee.setCantidadActual((coffee.getCantidadActual() + cantidadCafe >= coffee.getCapacidadMaxima()) ? coffee.getCapacidadMaxima() : coffee.getCantidadActual() + cantidadCafe);
    }
    
    public void printCafeteraData (Cafetera coffee){
        System.out.println(coffee.toString());
    }
}
