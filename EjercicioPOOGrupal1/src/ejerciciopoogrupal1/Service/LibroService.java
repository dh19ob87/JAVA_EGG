/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoogrupal1.Service;
import ejerciciopoogrupal1.Entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class LibroService {
    public Libro crearLibroInfo(){
        int isbn, numeroPaginas;
        String titulo, autor;
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el ISBN del libro.");
        isbn = input.nextInt();
        System.out.println("Por favor ingrese el autor");
        autor = input.next();
        System.out.println("Por favor ingrese el número de páginas");
        numeroPaginas = input.nextInt();
        System.out.println("Por favor ingres el título de la obra");
        titulo = input.next();
        
        return new Libro(isbn, titulo, autor, numeroPaginas);
    }
    
    public void imprimirDataLibroGetters(Libro ebook){
        System.out.println("Isbn: " + ebook.getIsbn() + " Título: " + ebook.getTitulo() + " Autor: " + ebook.getAutor() + " Número de páginas: " + ebook.getNumeroPaginas());
    }
    
    public void imprimirDataNoGetter(Libro ebook){
        System.out.println(ebook.toString());
    }
}
