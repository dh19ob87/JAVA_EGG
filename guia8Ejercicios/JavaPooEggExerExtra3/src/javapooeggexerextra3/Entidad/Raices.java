/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra3.Entidad;

/**
 *
 * @author diego
 */
public class Raices {
    private double a;
    private double b;
    private double c;
    
    public Raices(){}
    
    public Raices (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setA (double a){
        this.a = a;
    }
    
    public void setB (double b){
        this.b = b;
    }
    
    public void setC (double c){
        this.c = c;
    }
    
    public double getA (){
        return a;
    }
    
    public double getB (){
        return b;
    }
    
    public double getC (){
        return c;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
