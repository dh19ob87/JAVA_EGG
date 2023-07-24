/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa;

import java.util.Locale;
import testjpa.Entidades.Autor;
import testjpa.Entidades.Editorial;
import testjpa.Entidades.Libro;
import testjpa.Servicios.AutorServicio;
import testjpa.Servicios.EditorialServicio;
import testjpa.Servicios.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Menu {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private AutorServicio servicioAutor = new AutorServicio();
    private EditorialServicio servicioEditorial = new EditorialServicio();
    private LibroServicio servicioLibro = new LibroServicio();

    public Menu() {
        servicioAutor.setServicios(servicioLibro, servicioEditorial);
        servicioEditorial.setServicios(servicioAutor, servicioLibro);
        servicioLibro.setServicios(servicioAutor, servicioEditorial);
    }

    public void menuOpciones() throws Exception {
        int salir;
        do {
            System.out.println("""
                               ========== Bienvenido ==========
                               0. Salir
                               1. Crear autor
                               2. Crear editorial
                               3. Crear libro
                               4. Consultar todos los autores
                               5. Consultar autor por nombre
                               6. Consultar todas las editoriales
                               7. Consultar editorial por nombre
                               8. Consultar todos los libros
                               9. Consultar libros por ISBN
                               10. Consultar libros por título
                               11. Consultar libros por nombre de autor
                               12. Consultar libros por nombre de editorial
                               
                               Por favor ingrese una opción:
                               """);
            salir = INPUT.nextInt();
            switch (salir) {
                case 0 ->
                    System.out.println("Hasta pronto");
                case 1 ->
                    servicioAutor.crearAutor();
                case 2 ->
                    servicioEditorial.crearEditor();
                case 3 ->
                    servicioLibro.crearLibro();
                case 4 ->
                    servicioAutor.listarTodosLosAutores();
                case 5 -> {
                    try {
                        servicioAutor.buscarAutorPorNombre();
                    } catch (Exception e) {
                        System.out.println("El autor no existe");
                        System.out.println(e.getMessage());
                    }
                }
                case 6 ->
                    servicioEditorial.listarTodasLasEditoriales();
                case 7 -> {
                    try {
                        System.out.println(servicioEditorial.buscarEditorialPorId());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 8 -> {
                    try {
                        servicioLibro.listarTodosLosLibros();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 9 -> {
                    try {
                        System.out.println(servicioLibro.buscarLibroPorIsbn());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 10 -> {
                    try {
                        System.out.println(servicioLibro.buscarLibroPorTitulo());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 11 -> {
                    try {
                        servicioLibro.buscarLibroPorNombreAutor().forEach(System.out::println);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 12 -> {
                    try {
                        servicioLibro.buscarLibroPorNombreEditorial().forEach(System.out::println);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                default ->
                    System.out.println("Opción no permitida");
            }
        } while (salir != 0);
    }
}
