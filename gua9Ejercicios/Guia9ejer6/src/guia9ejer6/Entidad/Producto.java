/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer6.Entidad;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author diego
 */
public class Producto {

    private HashMap<String, Double> inventario;

    public Producto() {
        this.inventario = new HashMap<>();
    }

    public Producto(String nombreProducto, Double precio) {
        this.inventario = new HashMap<>();
        this.inventario.put(nombreProducto, precio);
    }

    public HashMap<String, Double> getInventario() {
        return inventario;
    }

    public void setInventario(HashMap<String, Double> inventario) {
        this.inventario = inventario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.inventario);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.inventario, other.inventario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "inventario=" + inventario + '}';
    }
}
