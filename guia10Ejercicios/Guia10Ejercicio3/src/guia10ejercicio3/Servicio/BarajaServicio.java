/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Servicio;

import guia10ejercicio3.Entidad.Baraja;
import java.util.Stack;
import guia10ejercicio3.Entidad.Palo;
import guia10ejercicio3.Enumerables.PaloClasico;
/**
 *
 * @author diego
 */
public class BarajaServicio {
    public Baraja crearBaraja (){
        PaloServicio ps = new PaloServicio();
        Stack <Palo> deckFamily = new Stack ();
        for(PaloClasico elemento : PaloClasico.values()){
            deckFamily.add(ps.crearPalo(elemento));
        }
        
        return new Baraja(deckFamily, new Stack<>());
    }
    
    public void imprimirBaraja(Baraja deck){
        deck.getDeckOfCards().forEach(elemento -> elemento.getBarajaPalo().forEach(System.out::println));
    }
}
