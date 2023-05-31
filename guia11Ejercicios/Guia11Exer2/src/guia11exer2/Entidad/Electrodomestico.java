/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer2.Entidad;

import guia11exer2.Enumerables.*;
/**
 *
 * @author diego
 */
public class Electrodomestico <T, T1> {
    protected double precio;
    protected T color;
    protected T1 consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, T color, T1 consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        precioFinal();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public T1 getConsumo() {
        return consumo;
    }

    public void setConsumo(T1 consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
     protected void precioFinal() {
        precio += precioSegunConsumo() + precioSegunPeso();
    }
    
    private double precioSegunConsumo(){
        return switch ((LetrasConsumo) consumo) {
            case A -> 1000d;
            case B -> 800d;
            case C -> 600d;
            case D -> 500d;
            case E -> 300d;
            case F -> 100d;
            default -> 100d;
        };
    }
    
    private double precioSegunPeso(){
        return (peso >= 1 && peso <= 19) ? 100d : (peso >= 20 && peso <= 49) ? 500d : (peso >= 50 && peso <= 79) ? 800d : 1000;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
}
