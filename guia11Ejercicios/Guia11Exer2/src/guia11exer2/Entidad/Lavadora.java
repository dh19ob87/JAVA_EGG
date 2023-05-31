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
public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, Color color, LetrasConsumo consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
        precioFinalLavadora();
    }
    

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    private void precioFinalLavadora(){
        precio += (carga > 30) ? 500 : 0;
    }

    @Override
    public String toString() {
        return "Lavadora{" +  " carga=" + carga + '}' + super.toString();
    }
}
