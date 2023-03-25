/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer2.Servicio;
import java.util.Scanner;
import javapooeggexer2.Entidad.Circunferencia;

/**
 *
 * @author diego
 */
public class CircunferenciaServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia (){
        System.out.println("Por favor ingrese el radio de la circunferencia");
        return new Circunferencia(INPUT.nextFloat());
    }
    
    public float area(Circunferencia circulo){
        return (float) (Math.pow(circulo.getRadio(), 2) * Math.PI);
    }
    
    public float perimetro(Circunferencia circulo){
        return (float) (2 * Math.PI * circulo.getRadio());
    }
    
    public void imprimirCircunferenciaData(Circunferencia circulo){
        System.out.println(circulo.toString());
    }
}
