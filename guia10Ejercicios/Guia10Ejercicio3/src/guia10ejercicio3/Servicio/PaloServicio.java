/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Servicio;

import guia10ejercicio3.Entidad.Carta;
import guia10ejercicio3.Entidad.Palo;
import guia10ejercicio3.Enumerables.PaloClasico;
import java.util.Stack;
import java.util.Collections;
/**
 *
 * @author diego
 */
public class PaloServicio {
    
    public Palo crearPalo (PaloClasico palo){
        Stack <Carta> grupoPalo = new Stack<>();
        for (int i = 1; i <= 12; i++) {
            if(i != 8 && i != 9){
                grupoPalo.add(new Carta(i, palo));
            }
        }
        return new Palo(grupoPalo, palo);
    }
    
    public void imprimirPalo(Palo deckFamily){
        System.out.println(deckFamily.toString());
    }
    
    public void desordenarPalo(Palo deckFamily){
        Collections.shuffle(deckFamily.getBarajaPalo());
    }
}
