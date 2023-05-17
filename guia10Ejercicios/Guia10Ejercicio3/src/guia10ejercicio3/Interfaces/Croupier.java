/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guia10ejercicio3.Interfaces;

import guia10ejercicio3.Entidad.Baraja;
import guia10ejercicio3.Entidad.Carta;
/**
 *
 * @author diego
 */
public interface Croupier {
    default void barajar (Baraja deck){
        System.out.println("Imprimiendo la baraja");
    }
    
    default Carta siguienteCarta(Baraja deck){
        System.out.println("Retornando la siguiente carta");
        return new Carta ();
    }
    
    default void cartasDisponibles (Baraja deck){
        System.out.println("Cantidad de cartas disponibles");
    }
    
    default void darCartas(Baraja deck, int cartasAEntregar){
        System.out.println("Entregando las cartas");
    }
    
    default void cartasMonton(Baraja deck){
        System.out.println("Mostrar cartas del montón ya entregado.");
    }
    
    default void mostrarBaraja (){
        System.out.println("Mostrando cartas que hay en la baraja");
    }
    
    
}
