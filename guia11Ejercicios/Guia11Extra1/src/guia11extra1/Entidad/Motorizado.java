/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Entidad;

import java.time.Year;

/**
 *
 * @author diego
 */
public class Motorizado extends Barco{
    private Double potenciaCv;

    public Motorizado() {
    }

    public Motorizado(Double potenciaCv, Long matricula, Double eslora, Year anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public Double getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Double potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "Motorizado{" + super.toString() + " potenciaCv=" + potenciaCv + '}';
    }
}
