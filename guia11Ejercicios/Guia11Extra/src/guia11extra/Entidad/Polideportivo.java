/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra.Entidad;

/**
 *
 * @author diego
 */
public class Polideportivo extends Edificio{

    private String nombre;
    private Boolean isTechado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean isTechado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.isTechado = isTechado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getIsTechado() {
        return isTechado;
    }

    public void setIsTechado(Boolean isTechado) {
        this.isTechado = isTechado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", isTechado=" + isTechado + '}';
    }
    
    @Override
    public Double calcularSuperficie (){
        return ancho * largo;
    }
    
    @Override
    public Double calcularVolumen (){
        return ancho * largo * alto;
    }
}
