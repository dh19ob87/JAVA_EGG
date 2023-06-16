/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Entidad;

import guia11extra4.Enumerables.EstadoCivil;

/**
 *
 * @author diego
 */
public abstract class Persona {

    protected String nombres;
    protected String apellidos;
    protected Long dni;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, Long dni, EstadoCivil estadoCivil) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public abstract void cambiarEstadoCivil();

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }
}
