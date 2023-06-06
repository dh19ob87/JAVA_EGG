/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Entidad;

import guia11extra4.Enumerables.EstadoCivil;
import java.time.Year;

/**
 *
 * @author diego
 */
public abstract class Empleado extends Persona{
    
    protected Year anioIncorporacionFacultad;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(Year anioIncorporacionFacultad, int numeroDespacho, String nombres, String apellidos, Long dni, EstadoCivil estadoCivil) {
        super(nombres, apellidos, dni, estadoCivil);
        this.anioIncorporacionFacultad = anioIncorporacionFacultad;
        this.numeroDespacho = numeroDespacho;
    }

    public Year getAnioIncorporacionFacultad() {
        return anioIncorporacionFacultad;
    }

    public void setAnioIncorporacionFacultad(Year anioIncorporacionFacultad) {
        this.anioIncorporacionFacultad = anioIncorporacionFacultad;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + "anioIncorporacionFacultad=" + anioIncorporacionFacultad + ", numeroDespacho=" + numeroDespacho + '}' + super.toString();
    }
}
