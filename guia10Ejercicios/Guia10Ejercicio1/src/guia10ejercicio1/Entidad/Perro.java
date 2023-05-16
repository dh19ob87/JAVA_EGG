/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio1.Entidad;

import guia10ejercicio1.Enumerable.RazasCanes;
/**
 *
 * @author diego
 */
public class Perro {
    private String nombre;
    private RazasCanes raza;
    private Integer edad;
    private Double tamano;
    
    public Perro (){}
    
    public Perro (String nombre, RazasCanes raza, Integer edad, Double tamano){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setRaza (RazasCanes raza){
        this.raza = raza;
    }
    
    public void setEdad (Integer edad){
        this.edad = edad;
    }
    
    public void setTamano (Double tamano){
        this.tamano = tamano;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public RazasCanes getRaza (){
        return raza;
    }
    
    public Integer getEdad (){
        return edad;
    }
    
    public Double getTamano (){
        return tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + '}';
    }
}
