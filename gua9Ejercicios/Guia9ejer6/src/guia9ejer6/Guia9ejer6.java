/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer6;

import guia9ejer6.Entidad.Producto;
import guia9ejer6.Servicio.ProductoServicio;

/**
 *
 * @author diego
 */
public class Guia9ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoServicio ps = new ProductoServicio();
        Producto stock = ps.crearInventario();
        ps.menu(stock);
    }
    
}
