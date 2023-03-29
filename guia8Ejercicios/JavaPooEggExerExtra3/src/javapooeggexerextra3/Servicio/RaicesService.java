/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra3.Servicio;

import javapooeggexerextra3.Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class RaicesService {

    public Raices crearRaices() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el valor de a, b y c; respectivametne.");
        return new Raices(input.nextDouble(), input.nextDouble(), input.nextDouble());
    }
    
    public double getDiscriminante (Raices values){
        return (Math.pow(values.getB(), 2) - (4 * values.getA() * values.getC()));
    }
    
    public boolean tieneRaices (Raices values){
        return (getDiscriminante(values) >= 0);
    }
    
    public boolean tieneRaiz(Raices values){
        return (getDiscriminante(values) == 0);
    }
    
    public void obtenerRaices (Raices values){
        if(!tieneRaices(values)){
            System.out.println("No tiene dos soluciones.");
        }else{
            System.out.printf("Raiz 1 = %f | Raíz 2 = %f \n", ((-values.getB() + (Math.sqrt(Math.pow(values.getB(), 2) - (4 * values.getA() * values.getC()))) / (2 * values.getA()))), (((-values.getB() - (Math.sqrt(Math.pow(values.getB(), 2) - (4 * values.getA() * values.getC()))) / (2 * values.getA())))));
        }
    }
    
    public void obtenerRaiz (Raices values){
        if(!tieneRaiz(values)){
            System.out.println("Tiene más de una solución o es compleja");
        }else{
            System.out.printf("Raíz = %f \n", (-values.getB() / 2 * values.getA()));
        }
    }
    
    public void calcular (Raices values){
        if(tieneRaiz(values)){
            obtenerRaiz(values);
        }else if(tieneRaices(values)){
            obtenerRaices(values);
        }else{
            System.out.println("No tiene raices o es compleja");
        }
    }
}
