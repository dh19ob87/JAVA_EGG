/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.Servicio;

import g14e1.Entidades.Producto;
import g14e1.persistencia.DAOProducto;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author diego
 */
public class ProductoServicio {

    private  DAOProducto daop;

    public ProductoServicio() {
        this.daop = new DAOProducto();
    }

    public Producto crearProducto() {
        return new Producto();
    }

    public void listarTodosLosProductos() throws Exception {
        try {
            daop.listarTodosLosProductos().forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarNombresYPreciosDeTodosLosProductos() throws Exception {
        try {
            daop.listarTodosLosProductos().forEach(producto -> {
                System.out.printf("nombre_producto = %s | precio_producto = %f \n", producto.getNombre(), producto.getPrecio());
            });
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void listarProductosEnIntervaloDePrecio() throws Exception {
        try {
            Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
            System.out.println("Por favor ingrese el límite inferior y superior del precio:");
            daop.listarProductosEnIntervaloDePrecio(input.nextInt(), input.nextInt()).forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarPortatiles () throws Exception {
        try {
            daop.consultarPortatiles().forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void productoDeMenorPrecio () throws Exception{
        try {
            System.out.println(daop.datosProductoMasBarato().toString());
        } catch (Exception e) {
            throw e;
        }
    }
}
