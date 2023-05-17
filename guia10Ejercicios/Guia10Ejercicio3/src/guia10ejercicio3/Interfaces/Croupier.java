/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guia10ejercicio3.Interfaces;

import guia10ejercicio3.Entidad.Baraja;
import java.util.Collections;
/**
 *
 * @author diego
 */
public interface Croupier {
    default void barajar (Baraja deck){
        Collections.shuffle(deck.getPilaJuego());
    }
    
    default boolean siguienteCarta(Baraja deck){
        deck.getDeckOfDiscartedCards().add(deck.getPilaJuego().pop());
        System.out.printf("%s \n", (deck.getPilaJuego().empty()) ? "Ya no hay más cartas. Fin del juego" : deck.getDeckOfDiscartedCards().peek().toString());
        return deck.getPilaJuego().empty();
    }
    
    default void cartasDisponibles (Baraja deck){
        System.out.println("Cantidad de cartas disponibles: " + deck.getPilaJuego().size());
    }
    
    default void darCartas(Baraja deck, int cartasAEntregar){
        if(deck.getPilaJuego().size() < cartasAEntregar){
            System.out.println("Solo dispone de " + deck.getPilaJuego().size() + " cartas.");
        }else{
            while (cartasAEntregar != 0 && !siguienteCarta(deck)) {
                cartasAEntregar--;
            }
        }
    }
    
    default void cartasMonton(Baraja deck){
        deck.getDeckOfDiscartedCards().forEach(System.out::println);
    }
    
    default void mostrarBaraja (Baraja deck){
        if(!deck.getPilaJuego().empty()){
            deck.getPilaJuego().forEach(System.out::println);
        }
    }
    
    
}
