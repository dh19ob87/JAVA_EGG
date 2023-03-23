/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer5.Entidad;

/**
 *
 * @author diego
 */
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private int interes;
    
    public Cuenta(){}
    
    public Cuenta (int numeroCuenta, long dni, double saldoActual, int interes){
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }
    
    public void setNumeroCuenta (int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public void setDni (long dni){
        this.dni = dni;
    }
    
    public void setSaldoActual (double saldoActual){
        this.saldoActual = saldoActual;
    }
    
    public void setInteres (int interes){
        this.interes = interes;
    }
    
    public int getNumeroCuenta (){
        return numeroCuenta;
    }
    
    public long getDni (){
        return dni;
    }
    
    public double getSaldoActual (){
        return saldoActual;
    }
    
    public int getInteres (){
        return interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
}
