/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer6;
import javapooeggexer6.Entidad.Cafetera;
import javapooeggexer6.Servicio.CafeteraServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera coffee = cs.crearCafetera();
        cs.llenarCafetera(coffee);
        cs.printCafeteraData(coffee);
        cs.servirTaza(coffee, 1000);
        cs.printCafeteraData(coffee);
        cs.vaciarCafetera(coffee);
        cs.printCafeteraData(coffee);
        cs.agregarCafé(coffee, 200);
        cs.printCafeteraData(coffee);
    }
}
