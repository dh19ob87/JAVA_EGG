/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Servicios;

import java.util.Locale;
import java.util.Scanner;
import testjpa.Entidades.Autor;
import testjpa.Persistencia.AutorDao;

/**
 *
 * @author diego
 */
public class AutorServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private final AutorDao daoAutor;
    private LibroServicio servicioLibro;
    private EditorialServicio servicioEditorial;
    
    public AutorServicio (){
        this.daoAutor = new AutorDao();
    }
    
    public void setServicios (LibroServicio servicioLibro, EditorialServicio servicioEditorial){
        this.servicioLibro = servicioLibro;
        this.servicioEditorial = servicioEditorial;
    }
    
    public void crearAutor () throws Exception{
        try {
            System.out.println("Por favor ingrese el nombre del autor.");
            Autor author = new Autor(0, INPUT.next(), true);
            daoAutor.guardar(author);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor crearAutor (String nombre) throws Exception{
        try {
            daoAutor.guardar(new Autor(0, nombre, Boolean.TRUE));
            return buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
//    public void editarAutor () throws Exception {
//        try {
//            
//        } catch (Exception e) {
//            throw e;
//        }
//    }
    
    public void listarTodosLosAutores () throws Exception{
        try {
            System.out.println("---------- Lista de autores ------------");
            daoAutor.consultarTodosLosAutores().forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarAutorPorNombre() throws Exception {
        try {
            System.out.println("Por favor ingrese el nombre del autor");
            Autor author = daoAutor.buscarAutorPorNombre(INPUT.next());
            if(author == null){
                throw new Exception("El autor no existe");
            }
            System.out.println(author);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        try {
            Autor author = daoAutor.buscarAutorPorNombre(nombre);
            return author;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarAutorPorNombreCQ() throws Exception {
        try {
            System.out.println("Por favor ingrese el nombre del autor");
            Autor author = daoAutor.buscarAutorPorNombreCQ(INPUT.next());
            System.out.println(author);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void darDeBajaAutor () throws Exception{
        try {
            System.out.println("Por favor ingrese el id del autor que va a dar de baja");
            Autor author = daoAutor.buscarAutorPorId(INPUT.nextInt());
            author.setAlta(Boolean.FALSE);
            daoAutor.editar(author);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor buscarAutorPorId () throws Exception {
        try {
            System.out.println("Por favor ingrese el id del autor");
            Autor author = daoAutor.buscarAutorPorId(INPUT.nextInt());            
            return author;
        } catch (Exception e) {
            throw e;
        }
    }
}
