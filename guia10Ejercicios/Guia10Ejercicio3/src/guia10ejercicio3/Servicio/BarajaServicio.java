/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Servicio;

import guia10ejercicio3.Entidad.Baraja;
import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;
import guia10ejercicio3.Entidad.Palo;
import guia10ejercicio3.Entidad.Carta;
import guia10ejercicio3.Interfaces.Croupier;
import guia10ejercicio3.Enumerables.PaloClasico;
import java.util.Locale;
/**
 *
 * @author diego
 */
public class BarajaServicio implements Croupier {
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
    
    public void crearPilaDeJuego (Baraja deck){
        Stack <Carta> pila = new Stack<>();
        
        deck.getDeckOfCards().forEach((var elemento) -> {
            for (int i = 0; i < elemento.getBarajaPalo().size(); i++) {
                pila.add((Carta) elemento.getBarajaPalo().get(i));
            }
        });
        Collections.shuffle(pila);
        deck.setPilaJuego(pila);
    }
    
    public void iniciarJuego (Baraja deck){
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        crearPilaDeJuego(deck);
        int opcion;
        do {
            System.out.println("<Bienvenido>");
            System.out.println("1. Mostrar baraja\n2. Cartas disponibles\n3. Siguiente carta\n4. Pedir cantidad una cantidad de cartas\n5. Mostrar cartas montón\n6. Barajar\n0. Salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 0 -> System.out.println("Hasta pronto.");
                case 1 -> mostrarBaraja(deck);
                case 2 -> cartasDisponibles(deck);
                case 3 -> siguienteCarta(deck);
                case 4 -> {
                    System.out.println("Por favor ingrese la cantidad de cartas que quiere:");
                    darCartas(deck, input.nextInt());
                }
                case 5 -> cartasMonton(deck);
                case 6 -> barajar(deck);
                default -> System.out.println("Operación no permitida.");
            }
        } while (opcion != 0 && !deck.getPilaJuego().empty());
    }
}
