/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g15e1maven.Persistencia;

import com.mycompany.g15e1maven.Entidades.Autor;
import jakarta.persistence.EntityExistsException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import org.eclipse.persistence.exceptions.DatabaseException;
import org.eclipse.persistence.exceptions.EclipseLinkException;


/**
 *
 * @author diego
 */
public final class AutorDao extends DAO <Autor>{
    
    
    @Override
    public void guardar (Autor author) throws EclipseLinkException, DatabaseException, Exception {
        try {
            super.guardar(author);
        } catch (EntityExistsException e){
            throw new Exception("El autor ya existe en la base de datos");
        } catch (EclipseLinkException | SQLIntegrityConstraintViolationException e){
            throw new Exception("El registro ya existe");
        }  catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminar (Integer id) throws Exception {
        try {
            Autor author = buscarAutorPorId(id);
            
            if(author == null){
                throw new Exception("El autor no existe");
            }
            
            super.eliminar(author);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor buscarAutorPorId(Integer id) throws Exception{
        try {
            conectarBD();
            return entityManager.find(Autor.class, id);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBD();
        }
    }
    
    public List <Autor> consultarTodosLosAutores () throws Exception{
        try {
            conectarBD();
            return entityManager.createQuery("SELECT a FROM Autor a").getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
}