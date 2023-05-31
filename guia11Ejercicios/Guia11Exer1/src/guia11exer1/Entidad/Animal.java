/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Entidad;

/**
 *
 * @author diego
 */
public class Animal <T> {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected T raza;
    
    public Animal (){}
    
    public Animal (String nombre, String alimento, int edad, T raza){
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setAlimento (String alimento){
        this.alimento = alimento;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public void setRaza (T raza){
        this.raza = raza;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAlimento(){
        return alimento;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public T getRaza(){
        return raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    public String imprimirAlimento(){
        return "Alimento: " + alimento;
    }
    
    public void sonidoAnimal(){
        System.out.println("Barf");
    }
}
