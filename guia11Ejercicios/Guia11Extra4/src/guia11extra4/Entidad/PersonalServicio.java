/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Entidad;

import guia11extra4.Enumerables.EstadoCivil;
import guia11extra4.Enumerables.Seccion;
import java.time.Year;

/**
 *
 * @author diego
 */
public class PersonalServicio extends Empleado{
    
    private Seccion seccionAsignada;

    public PersonalServicio() {
    }

    public PersonalServicio(Seccion seccionAsignada, Year anioIncorporacionFacultad, int numeroDespacho, String nombres, String apellidos, Long dni, EstadoCivil estadoCivil) {
        super(anioIncorporacionFacultad, numeroDespacho, nombres, apellidos, dni, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public Seccion getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(Seccion seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" + "seccionAsignada=" + seccionAsignada + '}' + super.toString();
    }
}
