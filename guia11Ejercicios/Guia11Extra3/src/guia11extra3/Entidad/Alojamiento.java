/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

/**
 *
 * @author diego
 */
public abstract class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected Gerente manager;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, Gerente manager) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.manager = manager;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Gerente getManager() {
        return manager;
    }

    public void setManager(Gerente manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", manager=" + manager + '}';
    }
}
