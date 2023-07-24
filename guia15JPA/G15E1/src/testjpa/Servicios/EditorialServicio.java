/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Servicios;

import testjpa.Entidades.Editorial;
import testjpa.Persistencia.EditorialDao;
import java.util.Locale;
import java.util.Scanner;
import java.util.Collection;

/**
 *
 * @author diego
 */
public class EditorialServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private final EditorialDao daoEditorial;
    private AutorServicio servicioAutor;
    private LibroServicio servicioLibro;
    
    public EditorialServicio (){
        this.daoEditorial = new EditorialDao();
    }
    
    public void setServicios (AutorServicio servicioAutor, LibroServicio servicioLibro){
        this.servicioAutor = servicioAutor;
        this.servicioLibro = servicioLibro;
    }
    
    public void crearEditor () throws Exception{
        try {
            System.out.println("Por favor ingrese el nombre del editor");
            daoEditorial.guardar(new Editorial(0, INPUT.next(), true));
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial crearEditor (String nombre) throws Exception{
        try {
            daoEditorial.guardar(new Editorial(0, nombre, Boolean.TRUE));
            return buscarEditorialPorNombre(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarEditor () throws Exception {
        try {
            System.out.println("Por favor ingrese el id de la editorial");
            daoEditorial.eliminar(INPUT.nextInt());
        } catch (Exception e) {
            throw e;
        }
    }
    
//    public void editarEditor () throws Exception {
//        try {
//            
//        } catch (Exception e) {
//            throw e;
//        }
//    }
    
    public void darDeBajaEditorial () throws Exception{
        try {
            Editorial editor = daoEditorial.buscarEditorialPorId(INPUT.nextInt());
            System.out.println("Por favor ingrese el id de la editorial.");
            editor.setAlta(Boolean.FALSE);
            daoEditorial.editar(editor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial buscarEditorialPorId () throws Exception {
        try {
            System.out.println("Por favor ingrese el id de la editorial");
            Editorial editor = daoEditorial.buscarEditorialPorId(INPUT.nextInt());
            if (editor == null){
                throw new Exception("La editorial no existe");
            }
            return editor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial buscarEditorialPorId (Integer id) throws Exception {
        try {
            Editorial editor = daoEditorial.buscarEditorialPorId(id);
            return editor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial buscarEditorialPorNombre (String nombre) throws Exception{
        try {
            Editorial editor = daoEditorial.buscarEditorialPorNombre(nombre);
            return editor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarTodasLasEditoriales () throws Exception {
        try {
            Collection <Editorial> listaEditores = daoEditorial.consultarTodasLasEditorialesCQ();
            if (listaEditores.isEmpty()){
                throw new Exception("No hay editores registrados");
            }
            listaEditores.forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }
}
