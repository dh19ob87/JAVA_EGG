/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer3.Entidad;

/**
 *
 * @author diego
 */
public class Operacion {
    private double numero1;
    private double numero2;
    
    public Operacion (){}
    
    public Operacion (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void setNumero1 (double number){
        numero1 = number;
    }
    
    public void setNumero2 (double number){
        numero2 = number;
    }
    
    public double getNumero1 (){
        return numero1;
    }
    
    public double getNumero2 (){
        return numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
}
