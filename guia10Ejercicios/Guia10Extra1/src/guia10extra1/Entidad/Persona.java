/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra1.Entidad;

import java.util.LinkedList;
/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Long documento;
    private LinkedList <Perro> mascota;
    
    public Persona (){}
    
    public Persona (String nombre, String apellido, Integer edad, Long documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = new LinkedList<>();
    }
    
    public Persona (String nombre, String apellido, Integer edad, Long documento, LinkedList <Perro> mascota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad (Integer edad){
        this.edad = edad;
    }
    
    public void setDocumento (Long documento){
        this.documento = documento;
    }
    
    public void setMascota (LinkedList <Perro> mascota){
        this.mascota = mascota;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public String getApellido (){
        return apellido;
    }
    
    public Integer getEdad (){
        return edad;
    }
    
    public Long getDocumento (){
        return documento;
    }
    
    public LinkedList <Perro> getMascota (){
        return mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascota=" + mascota.toString() + '}';
    }
}
