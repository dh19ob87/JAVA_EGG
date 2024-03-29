/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g15e1maven.Persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;
import jakarta.persistence.TransactionRequiredException;
import jakarta.persistence.EntityExistsException;
import java.sql.SQLException;
import org.eclipse.persistence.exceptions.EclipseLinkException;

/**
 *
 * @author diego
 * @param <T>
 */
public abstract class DAO <T> {
    
    protected final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.mycompany_G15E1Maven_jar_1.0-SNAPSHOTPU");
    protected EntityManager entityManager = entityManagerFactory.createEntityManager();
    
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
    
    protected void guardar (T objeto) throws EclipseLinkException, IllegalStateException, TransactionRequiredException, EntityExistsException, Exception{
        try {
            conectarBD();
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch(SQLException e){
            throw new Exception("Llave única repetida123");
        } catch (EclipseLinkException e){
            throw new Exception("El registro ya existe");
        } catch (IllegalStateException | TransactionRequiredException | RollbackException  e) {
            throw new Exception("No es posible realizar la operación. El autor ya existe en la BD. \n" + e.getLocalizedMessage());
        } catch (EntityExistsException e){
            throw e;
        } catch (Exception e){
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
