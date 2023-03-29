/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra5.Servicio;

import javapooeggexerextra5.Entidad.Palabra;
import java.time.Month;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class PalabraServicio {
    
    public Palabra crearPalabra (){
        return new Palabra(Month.of((int) (Math.random() * 13)).toString());
    }
    
    public void iniciarJuego (Palabra word){
        String mes;
        System.out.println(word.toString());
        do {
            System.out.println("¡Adivina el mes! Está en inglés.");
            mes = new Scanner(System.in).useDelimiter("\n").next();
            if(!mes.equalsIgnoreCase(word.getMesSecreto())){
                System.out.println("No acertaste. Inténtalo de nuevo.");
            }
        } while (!word.getMesSecreto().equalsIgnoreCase(mes));
        
        System.out.println("¡Ganaste!");
    }
}
