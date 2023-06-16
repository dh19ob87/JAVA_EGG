/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Entidad;

import guia11extra4.Enumerables.EstadoCivil;
import guia11extra4.Enumerables.Seccion;
import guia11extra4.Utilidades.IOUtilities;
import java.time.Year;
import java.util.Arrays;

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
    public void cambiarEstadoCivil(){
        System.out.println("Por favor ingrese el nuevo estado civil");
        System.out.println(Arrays.toString(EstadoCivil.values()));
        super.setEstadoCivil(EstadoCivil.valueOf(IOUtilities.input.next()));
    }

    @Override
    public String toString() {
        return "PersonalServicio{" + "seccionAsignada=" + seccionAsignada + '}' + super.toString();
    }
}
