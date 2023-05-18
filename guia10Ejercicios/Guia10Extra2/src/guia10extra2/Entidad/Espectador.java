/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Entidad;

/**
 *
 * @author diego
 */
public class Espectador {
    private String nombre;
    private int edad;
    private double saldoDisponible;
    private Asiento puesto;
    private Sala salaProyeccion;

    public Espectador() {
    }
    
    public Espectador(String nombre, int edad, double saldoDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldoDisponible = saldoDisponible;
        this.puesto = new Asiento();
        this.salaProyeccion = new Sala();
    }

    public Espectador(String nombre, int edad, double saldoDisponible, Asiento puesto, Sala salaProyeccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldoDisponible = saldoDisponible;
        this.puesto = puesto;
        this.salaProyeccion = salaProyeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Asiento getPuesto() {
        return puesto;
    }

    public void setPuesto(Asiento puesto) {
        this.puesto = puesto;
    }

    public Sala getSalaProyeccion() {
        return salaProyeccion;
    }

    public void setSalaProyeccion(Sala salaProyeccion) {
        this.salaProyeccion = salaProyeccion;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", saldoDisponible=" + saldoDisponible + ", puesto=" + puesto + ", salaProyeccion=" + salaProyeccion + '}';
    }
}
