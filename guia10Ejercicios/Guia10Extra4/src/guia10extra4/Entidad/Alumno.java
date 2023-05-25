/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Entidad;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Long dni;
    private Integer votosObtenidos;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Long dni, Integer votosObtenidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.votosObtenidos = votosObtenidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apellido;
    }

    public void setApeliido(String apeliido) {
        this.apellido = apeliido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Integer getVotosObtenidos() {
        return votosObtenidos;
    }

    public void setVotosObtenidos(Integer votosObtenidos) {
        this.votosObtenidos = votosObtenidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.apellido);
        hash = 31 * hash + Objects.hashCode(this.dni);
        hash = 31 * hash + Objects.hashCode(this.votosObtenidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.votosObtenidos, other.votosObtenidos);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", votosObtenidos=" + votosObtenidos + '}';
    }
}
