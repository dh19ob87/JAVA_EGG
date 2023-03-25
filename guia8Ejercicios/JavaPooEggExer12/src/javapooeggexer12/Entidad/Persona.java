/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer12.Entidad;
import java.time.LocalDate;
/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    
    public Persona (){}
    
    public Persona (String nombre, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = LocalDate.now().getYear() - fechaNacimiento.getYear();
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    } 
    
    public void setFechaNacimiento (LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public LocalDate getFechaNacimiento (){
        return fechaNacimiento;
    }
    
    public int getEdad (){
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
