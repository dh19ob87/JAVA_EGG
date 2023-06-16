/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12e1;

/**
 *
 * @author diego
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
}
