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
public class YateLujo extends Barco{

    private Integer cantidadCamarotes;
    private Double potenciaCv;

    public YateLujo() {
    }

    public YateLujo(Integer cantidadCamarotes, Double potenciaCv, Long matricula, Double eslora, Year anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
        this.potenciaCv = potenciaCv;
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(Integer cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Double getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Double potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "YateLujo{" + super.toString() + "cantidadCamarotes=" + cantidadCamarotes + ", potenciaCv=" + potenciaCv + '}';
    }
}
