/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Entidad;

import g12eintegrador.Enumerables.TipoParte;

/**
 *
 * @author diego
 */
public class Parte {
    
    private boolean estadoParte;
    private float consumoMinimo;
    private TipoParte nombreParte;

    public Parte() {
    }

    public Parte(boolean estadoParte, float consumoMinimo, TipoParte nombreParte) {
        this.estadoParte = estadoParte;
        this.consumoMinimo = consumoMinimo;
        this.nombreParte = nombreParte;
    }

    public boolean isEstadoParte() {
        return estadoParte;
    }

    public void setEstadoParte(boolean estadoParte) {
        this.estadoParte = estadoParte;
    }

    public float getConsumoMinimo() {
        return consumoMinimo;
    }

    public void setConsumoMinimo(float consumoMinimo) {
        this.consumoMinimo = consumoMinimo;
    }

    public TipoParte getNombreParte() {
        return nombreParte;
    }

    public void setNombreParte(TipoParte nombreParte) {
        this.nombreParte = nombreParte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parte{");
        sb.append("estadoParte=").append(estadoParte);
        sb.append(", consumoMinimo=").append(consumoMinimo);
        sb.append(", nombreParte=").append(nombreParte);
        sb.append('}');
        return sb.toString();
    }
}
