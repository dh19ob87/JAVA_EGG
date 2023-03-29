/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra3;

import javapooeggexerextra3.Entidad.Raices;
import javapooeggexerextra3.Servicio.RaicesService;

/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cod application logic here
        
        RaicesService rs = new RaicesService();
        Raices roots = rs.crearRaices();
        rs.calcular(roots);
    }

}
