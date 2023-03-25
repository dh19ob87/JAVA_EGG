/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer4.Entidad;

/**
 *
 * @author diego
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    
    public Rectangulo (){}
    
    /**
     * 
     * @param base
     * @param altura 
     */
    
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * 
     * @param base 
     */
    
    public void setBase (double base){
        this.base = base;
    }
    
    /**
     * 
     * @param altura 
     */
    
    public void setAltura (double altura){
        this.altura = altura;
    }
    
    public double getBase (){
        return base;
    }
    
    public double getAltura (){
        return altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}
