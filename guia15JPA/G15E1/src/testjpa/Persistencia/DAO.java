/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.TransactionRequiredException;
import jakarta.persistence.EntityExistsException;

/**
 *
 * @author diego
 * @param <T>
 */
public abstract class DAO <T> {
    
    protected final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testjpaPU");
    protected EntityManager entityManager = entityManagerFactory.createEntityManager();
    protected final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    protected CriteriaQuery <T> criteriaQuery;
    protected Root <T> root;
    protected Query query;
    
    protected void conectarBD() throws Exception{
        try {
            if(!entityManager.isOpen()){
                entityManager = entityManagerFactory.createEntityManager();
            }
        } catch(IllegalStateException e){
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void desconectarBD() throws Exception{
        try {
            if(entityManager.isOpen()){
                entityManager.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void guardar (T objeto) throws IllegalStateException, TransactionRequiredException, EntityExistsException, Exception{
        try {
            conectarBD();
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch (IllegalStateException | TransactionRequiredException | RollbackException  e) {
            System.out.println(e.getMessage());
        } catch (EntityExistsException e){
            System.out.println("Tupla existente");
            System.out.println(e.getMessage());
            throw e;
        } finally{
            desconectarBD();
        }
    }
    
    protected void editar (T objeto) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException, RollbackException, Exception{
        try {
            conectarBD();
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch(IllegalStateException | IllegalArgumentException | TransactionRequiredException | RollbackException e){
            desconectarBD();
            System.out.println(e.getMessage());
            throw e;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
    
    protected void eliminar (T objeto) throws IllegalStateException, TransactionRequiredException, RollbackException, Exception{
        try {
            conectarBD();
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
        } catch(IllegalStateException | TransactionRequiredException | RollbackException e){
            throw e;
        } catch (Exception e) {
            throw e;
        } finally{
            desconectarBD();
        }
    }   
}