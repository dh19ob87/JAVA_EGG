/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer6.Servicio;

import java.util.Scanner;
import guia9ejer6.Entidad.Producto;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author diego
 */
public class ProductoServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Producto crearInventario() {
        return new Producto();
    }

    public void agregarProducto(Producto stock) {
        System.out.println("Por favor ingrese el nombre del producto, enseguida su precio.");
        stock.getInventario().put(INPUT.next(), INPUT.nextDouble());
    }

    public void buscarProducto(Producto stock) {
        String searchKey;
        System.out.println("Por favor ingrese el nombre del producto");
        searchKey = INPUT.next();
        System.out.printf("Producto %s \n", (stock.getInventario().containsKey(searchKey)) ? "registrado " + stock.getInventario().get(searchKey) : "no registrado.");
    }

    public boolean buscarProducto(Producto stock, String producto) {
        return stock.getInventario().containsKey(producto);
    }

    public void eliminarProducto(Producto stock) {
        String searchKey;
        System.out.println("Por favor ingrese el nombre del producto a eliminar.");
        searchKey = INPUT.next();
        if (buscarProducto(stock, searchKey)) {
            stock.getInventario().remove(searchKey);
        } else {
            System.out.println("Producto no registrado.");
        }
    }

    public void modificarNombreProducto(Producto stock) {
        String viejoNombreProducto, nuevoNombreProducto;
        Double precioProducto;
        System.out.println("Por favor ingrese el nombre del producto a modificar");
        viejoNombreProducto = INPUT.next();

        if (!stock.getInventario().containsKey(viejoNombreProducto)) {
            System.out.println("Producto no registrado");
        } else {
            System.out.println("Por favor ingrese el nuevo nombre del producto");
            nuevoNombreProducto = INPUT.next();
            precioProducto = stock.getInventario().get(viejoNombreProducto);
            stock.getInventario().remove(viejoNombreProducto);
            stock.getInventario().put(nuevoNombreProducto, precioProducto);
        }
    }

    public void modificarPrecioProducto(Producto stock) {
        System.out.println("Por favor ingrese el nombre del producto seguido del nuevo precio");
        String nombreProducto;
        nombreProducto = INPUT.next();

        if (!stock.getInventario().containsKey(nombreProducto)) {
            System.out.println("Producto no registrad.");
        } else {
            stock.getInventario().replace(nombreProducto, INPUT.nextDouble());
        }
    }

    public void imprimirProductos(Producto stock) {
        stock.getInventario().forEach((key, value) -> {
            System.out.printf("Key: %s | Value: %f \n", key, value);
        });
    }
    
    public void imprimirProductosPorPrecioAsc(Producto stock){
        stock.getInventario().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
    
    public void imprimirProductosPorPreciosDesc(Producto stock){
        stock.getInventario().entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }
    
    public void imprimirProductosPorNombreAsc(Producto stock){
        stock.getInventario().entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
    
    public void imprimirProductosPorNombreDesc(Producto stock){
        stock.getInventario().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
    
    public void menu(Producto stock) {
        int salir;
        int terminar;

        do {
            System.out.println("Bienvenido \n1. Agregar productos \n2. Agregar producto \n3. Buscar Producto \n4. Imprimir Productos \n5. Eliminar producto \n6. Cantidad de productos \n7. Eliminar todo \n8. Modificar nombre producto \n9. Modificar precio Producto \n"
                    + "10. Imprimir nombre asc \n11. Imprimir nombre desc \n12. Imprimir precio asc \n13. Imprimir precio desc \n0. Salir \nPor favor ingrese una opción:");
            salir = INPUT.nextInt();

            switch (salir) {
                case 0:
                    System.out.println("Hasta pronto.");
                    break;
                case 1:
                    do {
                        agregarProducto(stock);
                        System.out.println("¿Desea continuar agregando productos?");
                        terminar = INPUT.nextInt();
                    } while (terminar != 0);
                    break;
                case 2:
                    agregarProducto(stock);
                    break;
                case 3:
                    buscarProducto(stock);
                    break;
                case 4:
                    imprimirProductos(stock);
                    break;
                case 5:
                    eliminarProducto(stock);
                    break;
                case 6:
                    System.out.println("Productos registrados: " + stock.getInventario().size());
                    break;
                case 7:
                    stock.getInventario().clear();
                    break;
                case 8:
                    modificarNombreProducto(stock);
                    break;
                case 9:
                    modificarPrecioProducto(stock);
                    break;
                case 10:
                    imprimirProductosPorNombreAsc(stock);
                    break;
                case 11:
                    imprimirProductosPorNombreDesc(stock);
                    break;
                case 12:
                    imprimirProductosPorPrecioAsc(stock);
                    break;
                case 13:
                    imprimirProductosPorPreciosDesc(stock);
                    break;
                default:
                    System.out.println("Operación no permitida.");
            }
        } while (salir != 0);

    }
}
