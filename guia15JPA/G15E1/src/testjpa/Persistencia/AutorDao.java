/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Persistencia;

import java.util.List;
import testjpa.Entidades.Autor;

/**
 *
 * @author diego
 */
public final class AutorDao extends DAO <Autor>{
    
    
    @Override
    public void guardar (Autor author) throws Exception {
        try {
            super.guardar(author);
        } catch (Exception e) {
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
