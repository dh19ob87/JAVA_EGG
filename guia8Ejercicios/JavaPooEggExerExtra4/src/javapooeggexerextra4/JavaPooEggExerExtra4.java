/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra4;

import javapooeggexerextra4.Entidad.NIF;
import javapooeggexerextra4.Servicio.NIFServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFServicio ns = new NIFServicio();
        NIF code = ns.crearNif();
        ns.mostrar(code);
    }
    
}
