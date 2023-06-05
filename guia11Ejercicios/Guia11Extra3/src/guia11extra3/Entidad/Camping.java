/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

import java.util.Objects;

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

    public Camping(Integer cantidadMaximaCarpas, Integer cantidadBanos, Boolean restaurante, Boolean isPrivete, Double area, Double precioEstadia, String nombre, String direccion, String localidad, Gerente manager) {
        super(isPrivete, area, precioEstadia, nombre, direccion, localidad, manager);
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
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.cantidadMaximaCarpas);
        hash = 89 * hash + Objects.hashCode(this.cantidadBanos);
        hash = 89 * hash + Objects.hashCode(this.restaurante);
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
        final Camping other = (Camping) obj;
        if (!Objects.equals(this.cantidadMaximaCarpas, other.cantidadMaximaCarpas)) {
            return false;
        }
        if (!Objects.equals(this.cantidadBanos, other.cantidadBanos)) {
            return false;
        }
        return Objects.equals(this.restaurante, other.restaurante);
    }
    
    @Override
    public String toString() {
        return "Camping{" + "cantidadMaximaCarpas=" + cantidadMaximaCarpas + ", cantidadBanos=" + cantidadBanos + ", restaurante=" + restaurante + '}' + super.toString();
    }

    @Override
    public void precioEstadia() {
        precioEstadia = 50 + cantidadMaximaCarpas + ((cantidadMaximaCarpas < 30) ? 10d : (cantidadMaximaCarpas >= 30 && cantidadMaximaCarpas <= 50) ? 30d : 50d);
    }
}
