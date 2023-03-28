/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra1.Servicio;
import java.util.Scanner;
import javapooeggexerextra1.Entidad.Cancion;
/**
 *
 * @author diego
 */
public class CancionServicio {
    
    public Cancion crearCancion (){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el título y el autor, respectivamente.");
        return new Cancion(input.next(), input.next());
    }
    
    public void imprimirCancion (Cancion song){
        System.out.println(song.toString());
    }
}
