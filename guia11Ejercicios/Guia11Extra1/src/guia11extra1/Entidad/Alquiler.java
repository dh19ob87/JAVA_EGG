/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Entidad;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author diego
 */
public class Alquiler {
    private String nombrePropietario;
    private Long dniPropietario;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Amarre posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombrePropietario, Long dniPropietario, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Amarre posicionAmarre, Barco barco) {
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public Long getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(Long dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Amarre getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Amarre posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombrePropietario=" + nombrePropietario + ", dniPropietario=" + dniPropietario + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
}
