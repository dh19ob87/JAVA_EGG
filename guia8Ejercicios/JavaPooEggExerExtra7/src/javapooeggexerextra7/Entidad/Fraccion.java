/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra7.Entidad;

/**
 *
 * @author diego
 */
public class Fraccion {
    
    private int denominadorA;
    private int numeradorA;
    private int denominadorB;
    private int numeradorB;
    
    public Fraccion(){
    }
    
    public Fraccion (int numeradorA, int denominadorA, int numeradorB, int denominadorB){
        this.denominadorA = denominadorA;
        this.numeradorA = numeradorA;
        this.denominadorB = denominadorB;
        this.numeradorB = numeradorB;
    }
    
    public void setDenominadorA (int denominadorA){
        this.denominadorA = denominadorA;
    }
    
    public void setDenominadorB (int denominadorB){
        this.denominadorB = denominadorB;
    }
    
    public void setNumeradorA (int numeradorA){
        this.numeradorA = numeradorA;
    }
    
    public void setNumeradorB (int numeradorB){
        this.numeradorB = numeradorB;
    }
    
    public int getDenominadorA (){
        return denominadorA;
    }
    
    public int getDenominadorB (){
        return denominadorB;
    }
    
    public int getNumeradorA (){
        return numeradorA;
    }
    
    public int getNumeradorB (){
        return numeradorB;
    }

    @Override
    
    public String toString(){
        return "Fracción A = " + numeradorA + "/" + denominadorA + " | Fracción B = " + numeradorB + "/" + denominadorB;
    }
    
}
