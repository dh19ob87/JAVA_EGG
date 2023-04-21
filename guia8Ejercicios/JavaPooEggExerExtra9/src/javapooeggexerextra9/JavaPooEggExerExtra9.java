/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra9;

import javapooeggexerextra9.Servicio.PassServicio;

/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PassServicio ps = new PassServicio();
        ps.menu(ps.ingresarDatosUsuario());
    }

}
