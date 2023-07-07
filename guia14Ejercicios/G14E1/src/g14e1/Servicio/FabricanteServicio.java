/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.Servicio;

import g14e1.Entidades.Fabricante;
import g14e1.persistencia.DAOFabricante;
import java.util.Collection;

/**
 *
 * @author diego
 */
public class FabricanteServicio {
    
    private DAOFabricante daof;
    
    public FabricanteServicio (){
        this.daof = new DAOFabricante();
    }
    
    public Fabricante crearFabricante(){
        return new Fabricante(0, "A");
    }
    
    public Fabricante crearFabricante(Integer codigo, String nombre){
        return new Fabricante(codigo, nombre);
    }
    
    public Collection<Fabricante> listarTodosLosFabricantes () throws Exception{
        try {
            return daof.listarNombreDeTodosLosFabricantes();
        } catch (Exception e) {
            throw e;
        }
    }
}
