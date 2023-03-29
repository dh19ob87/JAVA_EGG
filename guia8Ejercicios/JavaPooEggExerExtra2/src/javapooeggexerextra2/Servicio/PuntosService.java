/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra2.Servicio;
import javapooeggexerextra2.Entidad.Puntos;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class PuntosService {
    
    public Puntos crearPuntos (){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese los valores x1, y1, x2, y2; respectivamente.");
        return new Puntos(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
    }
    
    public void CalcularDistanciaEntrePuntos(Puntos points){
        System.out.printf("d(P1, P2) = %f  \n", (Math.sqrt(Math.pow((points.getX2() - points.getX1()), 2) + Math.pow((points.getY2() - points.getY1()), 2))));
    }
}