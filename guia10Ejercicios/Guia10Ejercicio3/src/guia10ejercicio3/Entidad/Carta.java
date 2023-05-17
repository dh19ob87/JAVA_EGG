/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio3.Entidad;

/**
 *
 * @author diego
 * @param <T>
 * @param <G>
 */
public class Carta <T, G> {
    private T valor;
    private G palo;
    
    public Carta(){}
    
    public Carta(T valor, G palo){
        this.valor = valor;
        this.palo = palo;
    }
    
    public void setValor (T valor){
        this.valor = valor;
    }
    
    public void setPalo (G palo){
        this.palo = palo;
    }
    
    public T getValor (){
        return valor;
    }
    
    public G getPalo (){
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "valor=" + valor + " palo=" + palo + '}';
    }
}
