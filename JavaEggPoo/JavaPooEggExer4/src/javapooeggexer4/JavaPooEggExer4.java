/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer4;
import javapooeggexer4.Entidad.Rectangulo;
import javapooeggexer4.Servicio.RectanguloServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloServicio servicioRectangulo = new RectanguloServicio();
        Rectangulo rectangle = servicioRectangulo.crearRectángulo();
        servicioRectangulo.superficieRectangulo(rectangle);
        servicioRectangulo.perimetroRectangulo(rectangle);
        servicioRectangulo.printInstanceRectangle(rectangle);
        servicioRectangulo.printRectangleAsteriscs(true, rectangle);
        System.out.println("");
        servicioRectangulo.printRectangleAsteriscs(false, rectangle);
        System.out.println("");
        RectanguloServicio.hola();
    }
    
}
