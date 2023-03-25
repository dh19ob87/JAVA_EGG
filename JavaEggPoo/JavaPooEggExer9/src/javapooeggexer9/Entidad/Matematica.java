/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer9.Entidad;

/**
 *
 * @author diego
 */
public class Matematica {
    private double numeroA;
    private double numeroB;
    
    public Matematica (){}
    
    public Matematica (double numeroA, double numeroB){
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
    
    public void setNumeroA (double numeroA){
        this.numeroA = numeroA;
    }
    
    public void setNumeroB (double numeroB){
        this.numeroB = numeroB;
    }
    
    public double getNumeroA (){
        return numeroA;
    }
    
    public double getNumeroB (){
        return numeroB;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numeroA=" + numeroA + ", numeroB=" + numeroB + '}';
    }
}
