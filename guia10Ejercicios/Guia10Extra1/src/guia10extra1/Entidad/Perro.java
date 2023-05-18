/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra1.Entidad;

import guia10extra1.Enumerables.RazasCanes;
/**
 *
 * @author diego
 */
public class Perro {

    private String nombre;
    private RazasCanes raza;
    private Integer edad;
    private Double tamano;
    private boolean adoptado;
    private Persona responsable;

    public Perro() {
    }

    public Perro(String nombre, RazasCanes raza, Integer edad, Double tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptado = false;
    }
    
    public Perro (String nombre, RazasCanes raza, Integer edad, Double tamano, Persona responsable){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.responsable = responsable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(RazasCanes raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }
    
    public void setResponsable (Persona responsable){
        this.responsable = responsable;
    }
    
    public void setAdoptado (Boolean adoptado){
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public RazasCanes getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getTamano() {
        return tamano;
    }
    
    public Persona getResponsable (){
        return responsable;
    }
    
    public Boolean getAdoptado (){
        return adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + ", adoptado=" + adoptado + ", responsable=" + responsable + '}';
    }
}
