/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Persistencia;

import testjpa.Entidades.Editorial;
import java.util.List;
/**
 *
 * @author diego
 */
public class EditorialDao extends DAO <Editorial>{
    
    @Override
    public void guardar (Editorial editor) throws Exception {
        try {
            super.guardar(editor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminar (Integer id) throws Exception{
        try {
            Editorial editor = buscarEditorialPorId(id);
            
            if (editor == null){
                throw new Exception("La editorial no existe.");
            }
            
            super.eliminar(editor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    @Override
    public void editar (Editorial editor) throws Exception{
        try {
            if(buscarEditorialPorId(editor.getId()) == null){
                throw new Exception("La editorial no existe");
            }
            
            super.editar(editor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial buscarEditorialPorId(Integer Id) throws IllegalArgumentException, Exception{
        try {
            conectarBD();
            return (Editorial) entityManager.find(Editorial.class, Id);
        } catch(IllegalArgumentException e){
            throw e;
        } catch (Exception e) {
            throw e;
        } finally{
            desconectarBD();
        }
    }
    
    public Editorial buscarEditorialPorNombre (String nombre) throws IllegalArgumentException, Exception{
        try {
            conectarBD();
            return (Editorial) entityManager.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        } catch(IllegalArgumentException e){
            throw e;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
    
    public List <Editorial> consultarTodasLasEditorialesCQ () throws Exception{
        try {
            conectarBD();
            criteriaQuery = criteriaBuilder.createQuery(Editorial.class);
            return entityManager.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
}
