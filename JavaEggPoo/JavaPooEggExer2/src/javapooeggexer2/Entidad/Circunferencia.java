/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer2.Entidad;

/**
 *
 * @author diego
 */
public class Circunferencia {
    private float radio;
    
    public Circunferencia (){
    
    }
    
    /**
     * 
     * @param radio 
     */
    public Circunferencia (float radio){
        this.radio = radio;
    }
    
    /**
     * 
     * @param radio 
     */
    public void setRadio (float radio){
        this.radio = radio;
    }
    
    /**
     * 
     * @return radio
     */
    public float getRadio (){
        return radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}
