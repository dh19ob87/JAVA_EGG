/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Servicios;

import testjpa.Entidades.Libro;
import testjpa.Entidades.Autor;
import testjpa.Servicios.AutorServicio;
import testjpa.Servicios.EditorialServicio;
import testjpa.Persistencia.LibroDao;
import java.util.Scanner;
import java.util.Locale;
import java.util.Collection;

/**
 *
 * @author diego
 */
public class LibroServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private final LibroDao daoLibro;
    private AutorServicio servicioAutor;
    private EditorialServicio servicioEditorial;

    public LibroServicio() {
        this.daoLibro = new LibroDao();
    }

    public void setServicios(AutorServicio author, EditorialServicio editor) {
        this.servicioAutor = author;
        this.servicioEditorial = editor;
    }

    public void crearLibro() throws Exception {
        try {
            int registrar = 0;
            int intentosPermitidos = 0;
            Libro book = new Libro();
            book.setIsbn(0L);
            System.out.println("Por favor ingrese el título del libro");
            book.setTitulo(INPUT.next());
            System.out.println("Por favor ingrese el año de publicación");
            book.setAnio(INPUT.nextInt());
            System.out.println("Por favor ingrese la cantidad de ejemplares disponibles");
            book.setEjemplares(INPUT.nextInt());
            book.setEjemplaresPrestados(0);
            book.setEjemplaresRestantes(book.getEjemplares());
            book.setAlta(Boolean.TRUE);
            do {
                if (intentosPermitidos >= 3) {
                    throw new Exception("Operación aboratada. Vuelva a intentarlo más tarde.");
                }

                if (book.getAutor() == null) {
                    book.setAutor(servicioAutor.buscarAutorPorId());
                    if (book.getAutor() == null) {
                        System.out.println("El autor no existe. ¿Desea registrarlo? 0. No 1. Sí");
                        registrar = INPUT.nextInt();
                        if (registrar == 0) {
                            intentosPermitidos++;
                        } else {
                            System.out.println("Por favor ingrese el nombre del autor");
                            book.setAutor(servicioAutor.crearAutor(INPUT.next()));
                        }
                    }
                }

                if (book.getEditorial() == null) {
                    System.out.println("Por favor ingrese el id de la editorial");
                    book.setEditorial(servicioEditorial.buscarEditorialPorId(INPUT.nextInt()));
                    if (book.getEditorial() == null) {
                        System.out.println("La editorial no existe ¿Desea registrarla?");
                        registrar = INPUT.nextInt();
                        if (registrar == 0) {
                            intentosPermitidos++;
                        } else {
                            System.out.println("Por favor ingrese el nombre de la editorial");
                            book.setEditorial(servicioEditorial.crearEditor(INPUT.next()));
                        }
                    }
                }
            } while (book.getAutor() == null || book.getEditorial() == null && intentosPermitidos < 3);
            
            daoLibro.guardar(book);
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarTodosLosLibros() throws Exception {
        try {
            Collection<Libro> listaDeLibros = daoLibro.consultarTodosLosLibros();
            if (listaDeLibros.isEmpty()) {
                throw new Exception("No hay libros registrados");
            }
            
            listaDeLibros.forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorIsbn() throws Exception {
        try {
            System.out.println("Por favor ingrese el isbn del libro");
            Libro book = daoLibro.buscarLibroPorIsbn(INPUT.nextLong());
            if(book == null){
                throw new Exception("El libro no existe");
            }
            return book;
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorTitulo() throws Exception {
        try {
            System.out.println("Por favor ingrese el título del libro");
            Libro book = daoLibro.buscarLibroPorTituloCQ(INPUT.next());
            if(book == null){
                throw new Exception("El libro no existe");
            }
            return book;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Libro> buscarLibroPorNombreAutor() throws Exception {
        try {
            System.out.println("Por favor ingrese el nombre del autor");
            Collection<Libro> bookList = daoLibro.buscarLibrosPorNombreAutor(INPUT.next());
            if(bookList.isEmpty()){
                throw new Exception("No hay libros de ese autor");
            }
            return bookList;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Libro> buscarLibroPorNombreEditorial() throws Exception {
        try {
            System.out.println("Por favor ingrese el nombre de la editorial");
            Collection<Libro> bookList = daoLibro.buscarLibrosPorNombreEditorial(INPUT.next());
            if(bookList.isEmpty()){
                throw new Exception("No hay libros de esa editorial");
            }
            return bookList;
        } catch (Exception e) {
            throw e;
        }
    }
}
