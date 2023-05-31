/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer4.Servicio;

import guia11exer4.Interfaces.CalcularPropiedadFormas;
import guia11exer4.Entidad.Rectangulo;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class RectanguloServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Rectangulo crearRectangulo (){
        System.out.println("Por favor ingrese la altura y base del rectangulo");
        return new Rectangulo(INPUT.nextDouble(), INPUT.nextDouble());
    }
    
    public void printRectangulo(Rectangulo rectangle){
        System.out.println(rectangle.toString());
    }
    
    public void calcularAreaRectangulo(Rectangulo rectangle){
        System.out.println("Área rectángulo Override method interface: " + rectangle.calcularArea(rectangle.getAltura(), rectangle.getBase()));
        System.out.println("Área rectángulo polimorfismo method interface: " + rectangle.calcularArea(rectangle.getAltura(), rectangle.getBase()));
    }
    
    public void calcularPerimetroRectangulo (Rectangulo rectangle){
        System.out.println("Perímetro rectángulo Override method interface: " + rectangle.calcularPerimetro(rectangle.getAltura(), rectangle.getBase()));
        System.out.println("Perímetro rectángulo polimorfismo method interface: " + rectangle.calcularPerimetro(rectangle.getBase(), rectangle.getAltura()));
    }

    public void calcularPropiedadRectanguloLambda(CalcularPropiedadFormas lambda, Rectangulo rectangle) {
        System.out.println("El área del círculo es (Functional interface): " + lambda.calcularPropiedad(rectangle));
    }
}
