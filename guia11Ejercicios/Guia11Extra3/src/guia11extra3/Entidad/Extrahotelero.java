/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

/**
 *
 * @author diego
 */
public abstract class Extrahotelero extends Alojamiento {

    protected Boolean isPrivete;
    protected Double area;

    public Extrahotelero() {
    }

    public Extrahotelero(Boolean isPrivete, Double area, String nombre, String direccion, String localidad, Gerente manager) {
        super(nombre, direccion, localidad, manager);
        this.isPrivete = isPrivete;
        this.area = area;
    }

    public Boolean getIsPrivete() {
        return isPrivete;
    }

    public void setIsPrivete(Boolean isPrivete) {
        this.isPrivete = isPrivete;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Extrahotelero{" + "isPrivete=" + isPrivete + ", area=" + area + '}';
    }

    protected abstract Double precioEstadia();
}
