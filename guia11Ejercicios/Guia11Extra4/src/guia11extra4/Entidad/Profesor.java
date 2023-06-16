/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Entidad;

import guia11extra4.Enumerables.Departamento;
import guia11extra4.Enumerables.EstadoCivil;
import guia11extra4.Utilidades.IOUtilities;
import java.time.Year;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Profesor extends Empleado{
    
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento, Year anioIncorporacionFacultad, int numeroDespacho, String nombres, String apellidos, Long dni, EstadoCivil estadoCivil) {
        super(anioIncorporacionFacultad, numeroDespacho, nombres, apellidos, dni, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public void cambiarEstadoCivil(){
        System.out.println("Por favor ingrese el nuevo estado civil");
        System.out.println(Arrays.toString(EstadoCivil.values()));
        super.setEstadoCivil(EstadoCivil.valueOf(IOUtilities.input.next()));
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}' + super.toString();
    }
}
