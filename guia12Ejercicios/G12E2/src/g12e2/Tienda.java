/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12e2;

/**
 *
 * @author diego
 */
public class Tienda {
    private String [] productos;

    public Tienda() {
    }

    public Tienda(String[] productos) {
        this.productos = productos;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "productos=" + productos + '}';
    }
}
