/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

/**
 *
 * @author diego
 */
public class Camping extends Extrahotelero {

    private Integer cantidadMaximaCarpas;
    private Integer cantidadBanos;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer cantidadMaximaCarpas, Integer cantidadBanos, Boolean restaurante, Boolean isPrivete, Double area, String nombre, String direccion, String localidad, Gerente manager) {
        super(isPrivete, area, nombre, direccion, localidad, manager);
        this.cantidadMaximaCarpas = cantidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.restaurante = restaurante;
    }

    public Integer getCantidadMaximaCarpas() {
        return cantidadMaximaCarpas;
    }

    public void setCantidadMaximaCarpas(Integer cantidadMaximaCarpas) {
        this.cantidadMaximaCarpas = cantidadMaximaCarpas;
    }

    public Integer getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(Integer cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantidadMaximaCarpas=" + cantidadMaximaCarpas + ", cantidadBanos=" + cantidadBanos + ", restaurante=" + restaurante + '}';
    }

    @Override
    public Double precioEstadia() {
        return 50 + cantidadMaximaCarpas + ((cantidadMaximaCarpas < 30) ? 10d : (cantidadMaximaCarpas >= 30 && cantidadMaximaCarpas <= 50) ? 30d : 50d);
    }
}
