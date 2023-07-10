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
    
    public void registrarProducto () throws Exception{
        try {
            Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
            
            System.out.println("Por favor ingrese el nombre, precio y código del fabricante del nuevo producto:");
            Producto product = new Producto(null, input.next(), input.nextDouble(), input.nextInt());
            daop.agregarProducto(product);
        } catch (Exception e) {
        }
    }
    
    public void modificarProducto () throws Exception{
        try {
            Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
            
            StringBuilder fields = new StringBuilder();
            Producto product = null;
            
            System.out.println("Por favor ingrese el código del producto");
            int codigoProducto = input.nextInt();
            int opcion = 0;
            
            if(!existeElProducto(codigoProducto)){
                throw new Exception("El producto no existe.");
            }
            
            product = new Producto();
            product.setCodigo(codigoProducto);
            
            for(int i = 1; i < Producto.class.getDeclaredFields().length - 1; i++){
                System.out.println("¿Desea modificar el " + Producto.class.getDeclaredFields()[i].getName() + " del producto? (0 - Sí | 1 - No)");
                opcion = input.nextInt();
                
                if(opcion == 0){
                    switch(i){
                        case 1 -> {
                            System.out.println("Por favor ingrese el nuevo nombre del producto:");
                            product.setNombre(input.next());
                            fields.append("nombre = '").append(product.getNombre()).append("'");
                        }
                        case 2 -> {
                            System.out.println("Por favor ingrese el nuevo precio del producto:");
                            product.setPrecio(input.nextDouble());
                            if(fields.toString().contains("nombre")){
                                fields.append(", ").append("precio = ").append(product.getPrecio());
                            }
                            else{
                                fields.append("precio = ").append(product.getPrecio());
                            }
                        }
                        default -> System.out.println("Campo inexistente.");
                    }
                }
            }
            
            daop.modificarProducto(product, fields.toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public boolean existeElProducto(int codigoProducto) throws Exception{
        try {
            return (daop.buscarProducto(codigoProducto)) != null;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
