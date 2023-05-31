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
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, double precio, Color color, LetrasConsumo consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
        precioFinalTelevisor();
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    private void precioFinalTelevisor() {
        precio += (resolucion > 40) ? precio * 0.3 : 0;
        precio += (TDT) ? 500 : 0;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + '}' + super.toString();
    }
}
