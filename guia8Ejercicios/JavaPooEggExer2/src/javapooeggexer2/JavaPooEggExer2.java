/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer2;
import javapooeggexer2.Entidad.Circunferencia;
import javapooeggexer2.Servicio.CircunferenciaServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircunferenciaServicio circuloServicio = new CircunferenciaServicio();
        Circunferencia circulo = circuloServicio.crearCircunferencia();
        System.out.println("Área = " + circuloServicio.area(circulo));
        System.out.println("Perímetro = " + circuloServicio.perimetro(circulo));
        circuloServicio.imprimirCircunferenciaData(circulo);
    }
    
}
