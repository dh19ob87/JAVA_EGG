/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Servicio;

import guia10ejercicio3.Entidad.Carta;
import guia10ejercicio3.Enumerables.PaloClasico;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CartaServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Carta crearCarta (Integer valor, PaloClasico palo){
        return new Carta <Integer, PaloClasico> (valor, palo);
    }
    
    public void imprimirCarta(Carta card){
        System.out.println(card.toString());
    }
    
    public void modificarValorCarta(Carta card){
        System.out.println("Por favor ingrese el valor:");
        card.setValor(INPUT.nextInt());
    }
    
    public void modificarPaloCarta (Carta card){
        imprimirEnumPalo();
        card.setPalo(INPUT.next().toUpperCase());
    }
    
    public void imprimirEnumPalo(){
        System.out.println("Por favor ingresa el palo correspondiente");
        for(PaloClasico elemento : PaloClasico.values()){
            System.out.println(elemento);
        }
    }
}
