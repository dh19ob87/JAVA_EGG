/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer7.Entidad;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    
    public Persona(){}
    
    public Persona (String nombre, int edad, char sexo, double peso, double altura){
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public void setSexo (char sexo){
        this.sexo = sexo;
    }
    
    public void setPeso (double peso){
        this.peso = peso;
    }
    
    public void setAltura (double altura){
        this.altura = altura;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public int getEdad (){
        return edad;
    }
    
    public char getSexo (){
        return sexo;
    }
    
    public double getPeso (){
        return peso;
    }
    
    public double getAltura (){
        return altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
}
