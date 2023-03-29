/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra2;
import javapooeggexerextra2.Entidad.Puntos;
import javapooeggexerextra2.Servicio.PuntosService;
/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PuntosService pointsService = new PuntosService();
        Puntos points = pointsService.crearPuntos();
        pointsService.CalcularDistanciaEntrePuntos(points);
    }
    
}
