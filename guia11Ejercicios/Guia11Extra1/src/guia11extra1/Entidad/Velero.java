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
public class Velero extends Barco{
    private Integer cantidadMastiles;

    public Velero() {
    }

    public Velero(Integer cantidadMastiles, Long matricula, Double eslora, Year anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.cantidadMastiles = cantidadMastiles;
    }

    

    public Integer getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(Integer cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "cantidadMastiles=" + cantidadMastiles + '}';
    }
}
