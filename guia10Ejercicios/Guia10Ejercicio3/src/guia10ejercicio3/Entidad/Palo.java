/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Entidad;

import java.util.Stack;

/**
 *
 * @author diego
 * @param <T>
 */
public class Palo <T> {
    private Stack <Carta> barajaPalo;
    private T paloCarta;
    
    public Palo (){}
    
    public Palo (Stack<Carta> barajaPalo, T paloCarta){
        this.barajaPalo = barajaPalo;
        this.paloCarta = paloCarta;
    }
    
    public void setBarajaPalo (Stack <Carta> barajaPalo){
        this.barajaPalo = barajaPalo;
    }
    
    public void setPaloCarta (T paloCarta){
        this.paloCarta = paloCarta;
    }
    
    public Stack <Carta> getBarajaPalo (){
        return barajaPalo;
    }
    
    public T getpaloCarta (){
        return paloCarta;
    }

    @Override
    public String toString() {
        return "Palo{" + "barajaPalo=" + barajaPalo + ", paloCarta=" + paloCarta + '}';
    }
}
