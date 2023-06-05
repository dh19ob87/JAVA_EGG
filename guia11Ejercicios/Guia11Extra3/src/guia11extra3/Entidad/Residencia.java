/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

/**
 *
 * @author diego
 */
public class Residencia extends Extrahotelero {

    private Integer cantidadHabitaciones;
    private Boolean descuentoAGremios;
    private Boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantidadHabitaciones, Boolean descuentoAGremios, Boolean campoDeportivo, Boolean isPrivete, Double area, Double precioEstadia, String nombre, String direccion, String localidad, Gerente manager) {
        super(isPrivete, area, precioEstadia, nombre, direccion, localidad, manager);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoAGremios = descuentoAGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Boolean getDescuentoAGremios() {
        return descuentoAGremios;
    }

    public void setDescuentoAGremios(Boolean descuentoAGremios) {
        this.descuentoAGremios = descuentoAGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentoAGremios=" + descuentoAGremios + ", campoDeportivo=" + campoDeportivo + '}' + super.toString();
    }
    
    @Override
    public void precioEstadia(){
        precioEstadia = 50 + ((double) cantidadHabitaciones);
    }
}
