/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra5;

import javapooeggexerextra5.Entidad.Palabra;
import javapooeggexerextra5.Servicio.PalabraServicio;

/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PalabraServicio ps = new PalabraServicio();
        Palabra word =  ps.crearPalabra();
        ps.iniciarJuego(word);
    }
    
}
