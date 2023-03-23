/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer4.Servicio;
import java.util.Scanner;
import javapooeggexer4.Entidad.Rectangulo;
/**
 *
 * @author diego
 */
public class RectanguloServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * 
     * @return Rectangulo
     */
    
    public Rectangulo crearRectángulo (){
        System.out.println("Por favor ingrese la base y la altura, respectivamente.");
        return new Rectangulo(INPUT.nextDouble(), INPUT.nextDouble());
    }
    
    /**
     * 
     * @param rectangle 
     */
    
    public void superficieRectangulo (Rectangulo rectangle){
        System.out.printf("Superficie = %f * %f = %f \n", rectangle.getBase(), rectangle.getAltura(), (rectangle.getBase() * rectangle.getAltura()));
    }
    
    /**
     * 
     * @param rectangle 
     */
    
    public void perimetroRectangulo (Rectangulo rectangle){
        System.out.printf("Perimetro = (%f + %f) * 2 = %f \n", rectangle.getBase(), rectangle.getAltura(), ((rectangle.getAltura() + rectangle.getBase()) * 2));
    }
    
    /**
     * 
     * @param rectangle 
     */
    
    public void printInstanceRectangle (Rectangulo rectangle){
        System.out.println(rectangle.toString());
    }
    
    /**
     * 
     * @param fill
     * @param rectangle 
     */
    
    public void printRectangleAsteriscs (boolean fill, Rectangulo rectangle){
        if (!fill){
            for (int i = 0; i < rectangle.getAltura(); i++) {
                for (int j = 0; j < rectangle.getBase(); j++) {
                    if(i == 0 || i == rectangle.getAltura() - 1){
                        System.out.print("*");
                    }else if(j == 0 || j == rectangle.getBase() - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }else{
            for (int i = 0; i < rectangle.getAltura(); i++) {
                for (int j = 0; j < rectangle.getBase(); j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
    
    /**
     * 
     */
    
    public static void hola(){
        System.out.println("Hola, soy un método con el modificador Static");
    }
}
