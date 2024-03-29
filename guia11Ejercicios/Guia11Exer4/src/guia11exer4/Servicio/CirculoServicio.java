/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer4.Servicio;

import guia11exer4.Interfaces.CalcularPropiedadFormas;
import guia11exer4.Entidad.Circulo;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CirculoServicio {
    
    public Circulo crearCirculo (){
        System.out.println("Por favor ingrese el radio del círculo");
        return new Circulo(new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US).nextDouble());
    }
    
    public void printCirculo(Circulo circle){
        System.out.println(circle.toString());
    }
    
    public void calcularArea(Circulo circle){
        System.out.println("Área círculo Override interface: " + circle.calcularArea(circle.getRadio()));
        System.out.println("Área círculo polimorfismo interface method: " + circle.calcularArea(circle.getRadio()));
    }
    
    public void calcularPerimetro (Circulo circle){
        System.out.println("Perímetro círculo Override interface: " + circle.calcularPerimetro(circle.getRadio()));
        System.out.println("Perímetro círculo polimorfismo interface method: " + circle.calcularPerimetro(circle.getRadio()));
    }
    
    public void calcularPropiedadCirculo(CalcularPropiedadFormas lambda, Circulo circle){
        System.out.println("Área circulo functional interface: "  + lambda.calcularPropiedad(circle));
    }
}
