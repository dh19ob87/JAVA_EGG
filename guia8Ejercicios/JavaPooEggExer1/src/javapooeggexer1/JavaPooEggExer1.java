/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer1;
import javapooeggexer1.Entidad.Libro;
import javapooeggexer1.Servicio.LibroServicio;

/**
 *
 * @author diego
 */
public class JavaPooEggExer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroServicio bookServicio = new LibroServicio();
        Libro book = bookServicio.crearLibro();
        
        System.out.println(book);
        
        bookServicio.cargarLibro(book);
        bookServicio.imprimirDataLibro(book);
    }
    
}
