/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Entidad;

/**
 *
 * @author diego
 */
public class Amarre {
    private Integer posicion;
    private boolean ocupado;

    public Amarre() {
    }

    public Amarre(Integer posicion, boolean ocupado) {
        this.posicion = posicion;
        this.ocupado = ocupado;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Amarre{" + "posicion=" + posicion + ", ocupado=" + ocupado + '}';
    }
}
