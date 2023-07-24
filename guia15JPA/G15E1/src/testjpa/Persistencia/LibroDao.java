/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Persistencia;

import testjpa.Entidades.Libro;
import java.util.Collection;

/**
 *
 * @author diego
 */
public class LibroDao extends DAO <Libro>{

    @Override
    public void guardar(Libro book) throws Exception{
        try {
            super.guardar(book);
        } catch (Exception e) {
            throw e;
        }
    }
    
    @Override
    public void editar (Libro book) throws Exception {
        try {
            if(buscarLibroPorIsbn(book.getIsbn()) == null){
                throw new Exception("El libro no existe");
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminar (Long isbn) throws Exception {
        try {
            Libro book = buscarLibroPorIsbn(isbn);
            
            if(book == null){
                throw new Exception("El libro no existe");
            }
            
            super.eliminar(book);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Libro buscarLibroPorIsbn (Long isbn) throws IllegalArgumentException, Exception {
        try {
            conectarBD();
            return entityManager.find(Libro.class, isbn);
        } catch (IllegalArgumentException e){
            throw e;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
    
    public Libro buscarLibroPorTituloCQ (String title) throws Exception {
        try {
            conectarBD();
            criteriaQuery = criteriaBuilder.createQuery(Libro.class);
            root = criteriaQuery.from(Libro.class);
            criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("titulo"), title));
            query = entityManager.createQuery(criteriaQuery);
            
            return (Libro) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
    
    public Collection <Libro> buscarLibrosPorAutor (String author) throws Exception {
        try {
            conectarBD();
            return entityManager.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre = :autor").setParameter("autor", author).getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
}
