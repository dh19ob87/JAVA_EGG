/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer1.Servicio;

import java.util.Scanner;
import javapooeggexer1.Entidad.Libro;

/**
 *
 * @author diego
 */
public class LibroServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * 
     * @return Libro
     */
    
    public Libro crearLibro(){
        return new Libro();
    }
    
    /**
     * 
     * @param book 
     */
    
    public void cargarLibro(Libro book){
        System.out.println("Por favor ingrese el ISBN del libro.");
        book.setIsbn(INPUT.nextInt());
        System.out.println("Por favon ingrese el título del libro.");
        book.setTitle(INPUT.next());
        System.out.println("Por favor ingrese el autor del libro.");
        book.setAuthor(INPUT.next());
        System.out.println("Por favor ingrese el número de páginas del libro.");
        book.setNumeroPaginas(INPUT.nextInt());
    }
    
    /**
     * 
     * @param book 
     */
    
    public void imprimirDataLibro (Libro book){
        System.out.println(book.toString());
    }
    
}
