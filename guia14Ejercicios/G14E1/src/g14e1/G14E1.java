/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g14e1;

import g14e1.Entidades.Fabricante;
import g14e1.Entidades.Producto;
import g14e1.Servicio.FabricanteServicio;
import g14e1.Servicio.ProductoServicio;

/**
 *
 * @author diego
 */
public class G14E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs =  new FabricanteServicio();
        
        // Lista el nombre de todos los productos que hay en la tabla producto.
        try{
            System.out.println("Lista de todos los fabricantes \n");
            fs.listarTodosLosFabricantes().forEach(System.out::println);
            System.out.println("");
            
            System.out.println("Lista de todos los productos \n");
            ps.listarTodosLosProductos();
            System.out.println("");
            
            
            System.out.println("Lista de nombres y precios de cada producto \n");
            ps.listarNombresYPreciosDeTodosLosProductos();
            System.out.println("");
            
            System.out.println("Lista de productos en intervalo de precio \n");
            ps.listarProductosEnIntervaloDePrecio();
            System.out.println("");
            
            System.out.println("Lista de portátiles \n");
            ps.listarPortatiles();
            System.out.println("");
            
            System.out.println("Producto más barato \n");
            ps.productoDeMenorPrecio();
            System.out.println("");
            
            System.out.println("Agregando producto \n");
            ps.registrarProducto();
            System.out.println("");
            ps.listarTodosLosProductos();
            System.out.println("");
            
            System.out.println("Modificando producto \n");
            ps.modificarProducto();
            System.out.println("");
            ps.listarTodosLosProductos();
            System.out.println("");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
