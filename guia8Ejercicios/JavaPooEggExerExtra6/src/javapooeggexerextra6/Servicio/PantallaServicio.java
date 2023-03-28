/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra6.Servicio;
import javapooeggexerextra6.Entidad.Pantalla;
import javapooeggexerextra6.Entidad.Ahorcado;

/**
 *
 * @author diego
 */
public class PantallaServicio {

    public Pantalla crearPantalla(String word) {
        return new Pantalla(word);
    }

    public void printPalabraAhorcado(Pantalla screen, Ahorcado hangman) {
        
        String palabraAImprimir = "";
        for (int i = 0; i < crearPalabra(hangman.getPalabraABuscar()).length(); i++) {
            if (hangman.getLetrasFaltantes().contains(hangman.getPalabraABuscar()[i])) {
                palabraAImprimir += " * ";
            }else{
                palabraAImprimir += " " + hangman.getPalabraABuscar()[i] + " " ;
            }
        }

        System.out.println(palabraAImprimir);
    }
    
    public String crearPalabra (String [] palabra){
        String resultado = "";
        
        for(String elemento : palabra){
            resultado += elemento;
        }
        
        return resultado;
    }
}
