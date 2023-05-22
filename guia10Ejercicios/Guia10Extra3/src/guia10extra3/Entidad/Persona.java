/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Entidad;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Long dni;
    private String email;
    private String address;
    private long numeroCelular;
    
    public Persona (){}
    
    public Persona (String nombre, String apellido, Long dni, String email, String address, long numeroCelular){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.address = address;
        this.numeroCelular = numeroCelular;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
     
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    
    public void setDni (Long dni){
        this.dni = dni;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
    public void setNumeroCelular (long numeroCelular){
        this.numeroCelular = numeroCelular;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public String getApellido (){
        return apellido;
    }
    
    public Long getDni (){
        return dni;
    }
    
    public String getEmail (){
        return email;
    }
    
    public String getAddress (){
        return address;
    }
    
    public long getNumeroCelular (){
        return numeroCelular;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellido);
        hash = 59 * hash + (int) (this.dni ^ (this.dni >>> 32));
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.address);
        hash = 59 * hash + (int) (this.numeroCelular ^ (this.numeroCelular >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.dni != other.dni) {
            return false;
        }
        if (this.numeroCelular != other.numeroCelular) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.address, other.address);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email + ", address=" + address + ", numeroCelular=" + numeroCelular + '}';
    }
}
