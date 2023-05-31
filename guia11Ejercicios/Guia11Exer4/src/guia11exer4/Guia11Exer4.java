/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11exer4;

import guia11exer4.Interfaces.CalcularPropiedadFormas;
import guia11exer4.Entidad.*;
import guia11exer4.Servicio.*;

/**
 *
 * @author diego
 */
public class Guia11Exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalcularPropiedadFormas areaRectangulo = (Object... values) -> ((Rectangulo) values[0]).getAltura() * ((Rectangulo) values[0]).getBase();
        CalcularPropiedadFormas perimetroRectangulo = (Object... values) -> (((Rectangulo) values[0]).getAltura() + ((Rectangulo) values[0]).getBase()) * 2;
        CalcularPropiedadFormas areaCirculo = (Object... vars) -> (Math.PI * (Math.pow(((Circulo) vars[0]).getRadio(), 2)));
        CalcularPropiedadFormas perimetroCirculo = (Object... vars) -> (2 * ((Circulo) vars[0]).getRadio()) * Math.PI;
        
        CirculoServicio cs = new CirculoServicio();
        RectanguloServicio rs = new RectanguloServicio();
        System.out.println("===========CIRCULO===========");
        System.out.println("Interfaz no funcional");
        cs.calcularArea(cs.crearCirculo());
        cs.calcularPerimetro(cs.crearCirculo());
        System.out.println("\nInterfaz funcional");
        cs.calcularPropiedadCirculo(areaCirculo, cs.crearCirculo());
        cs.calcularPropiedadCirculo(perimetroCirculo, cs.crearCirculo());
        System.out.println("===========RECTANGULO==========="); 
        System.out.println("Interfaz no funcional");
        rs.calcularAreaRectangulo(rs.crearRectangulo());
        rs.calcularPerimetroRectangulo(rs.crearRectangulo());
        System.out.println("\nInterfaz funcional");
        rs.calcularPropiedadRectanguloLambda(areaRectangulo, rs.crearRectangulo());
        rs.calcularPropiedadRectanguloLambda(perimetroRectangulo, rs.crearRectangulo());
    }

}
