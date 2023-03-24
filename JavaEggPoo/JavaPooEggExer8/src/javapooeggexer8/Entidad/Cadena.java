/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer8.Entidad;

/**
 *
 * @author diego
 */
public class Cadena {
    private String frase;
    private int longitudFrase;
    
    public Cadena (){}
    
    public Cadena (String frase){
        this.frase = frase;
        this.longitudFrase = frase.length();
    }
    
    public void setFrase (String frase){
        this.frase = frase;
    }
    
    public void setLongitudFrase (){
        this.longitudFrase = this.frase.length();
    }
    
    public String getFrase (){
        return frase;
    }
    
    public int getLongitudFrase (){
        return longitudFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitudFrase=" + longitudFrase + '}';
    }
    
}
