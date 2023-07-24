/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Persistencia;

import jakarta.persistence.NoResultException;
import java.util.List;
import testjpa.Entidades.Autor;

/**
 *
 * @author diego
 */
public final class AutorDao extends DAO <Autor> {

    @Override
    public void guardar(Autor author) throws Exception {
        try {
            super.guardar(author);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminar(Integer id) throws Exception {
        try {
            Autor author = buscarAutorPorId(id);

            if (author == null) {
                throw new Exception("El autor no existe");
            }

            super.eliminar(author);
        } catch (Exception e) {
            throw e;
        }
    }
    
    @Override
    public void editar(Autor author) throws Exception {
        try {
            if (buscarAutorPorId(author.getId()) == null) {
                throw new Exception("El usuario no existe.");
            }

            super.editar(author);
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor buscarAutorPorId(Integer id) throws IllegalArgumentException, Exception {
        try {
            conectarBD();
            return entityManager.find(Autor.class, id);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }

    public List<Autor> consultarTodosLosAutores() throws Exception {
        try {
            conectarBD();
            return entityManager.createQuery("SELECT a FROM Autor a").getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }

    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        try {
            conectarBD();
            return (Autor) entityManager.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }

    public Autor buscarAutorPorNombreCQ(String nombre) throws NoResultException, Exception {
        try {
            conectarBD();
            criteriaQuery = criteriaBuilder.createQuery(Autor.class); // importante, no olvides que este proviene del Criteria Builder
            root = criteriaQuery.from(Autor.class);
            criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("nombre"), nombre));

            query = entityManager.createQuery(criteriaQuery); // En lugar de pasar el String de la query envío la instancia CriteriaQuery
            return (Autor) query.getSingleResult();
        } catch (NoResultException e){
            throw new Exception("El autor no existe");
        }catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
}
