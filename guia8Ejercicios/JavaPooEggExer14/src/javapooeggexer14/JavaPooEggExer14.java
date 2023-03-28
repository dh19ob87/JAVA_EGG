/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer14;
import javapooeggexer14.Entidad.Movil;
import javapooeggexer14.Servicio.MovilService;
/**
 *
 * @author diego
 */
public class JavaPooEggExer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovilService ms = new MovilService();
        Movil cell = ms.cargarCelular();
        ms.imprimirMovil(cell);
    }
    
}
