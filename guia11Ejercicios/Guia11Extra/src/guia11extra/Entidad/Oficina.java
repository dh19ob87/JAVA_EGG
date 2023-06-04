/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra.Entidad;

/**
 *
 * @author diego
 */
public class Oficina {
    private Integer numeroDePisos;
    private Integer maxPersonasEnOficina;

    public Oficina() {
    }

    public Oficina(Integer numeroDePisos, Integer maxPersonasEnOficina) {
        this.numeroDePisos = numeroDePisos;
        this.maxPersonasEnOficina = maxPersonasEnOficina;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getMaxPersonasEnOficina() {
        return maxPersonasEnOficina;
    }

    public void setMaxPersonasEnOficina(Integer maxPersonasEnOficina) {
        this.maxPersonasEnOficina = maxPersonasEnOficina;
    }

    @Override
    public String toString() {
        return "Oficina{" + "numeroDePisos=" + numeroDePisos + ", maxPersonasEnOficina=" + maxPersonasEnOficina + '}';
    }
}
