/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Entidad;

import java.util.Stack;
/**
 *
 * @author diego
 */
public class Baraja {
    private Stack <Palo> deckOfCarts;
    private Stack <Carta> deckOfDiscartedCards;
    
    public Baraja (){}
    
    public Baraja (Stack <Palo> deckOfCards, Stack <Carta> deckOfDiscartedCards){
        this.deckOfCarts = deckOfCards;
        this.deckOfDiscartedCards = deckOfDiscartedCards;
    }
    
    public void setDeckOfCards(Stack <Palo> deckOfCards){
        this.deckOfCarts = deckOfCards;
    }
    
    public void setDeckOfDiscartedCards (Stack <Carta> deckOfDiscartedCards){
        this.deckOfDiscartedCards = deckOfDiscartedCards;
    }
    
    public Stack<Palo> getDeckOfCards (){
        return deckOfCarts;
    }
    
    public Stack<Carta> getDeckOfDiscartedCards(){
        return deckOfDiscartedCards;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Baraja{" + "deckOfCarts=" + deckOfCarts + ", deckOfDiscartedCards=" + deckOfDiscartedCards + '}';
    }
}
