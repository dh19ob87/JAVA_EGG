/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra1;
import javapooeggexerextra1.Entidad.Cancion;
import javapooeggexerextra1.Servicio.CancionServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CancionServicio cs = new CancionServicio();
        Cancion song = cs.crearCancion();
        cs.imprimirCancion(song);
    }
    
}
