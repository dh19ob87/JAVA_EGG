/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Familia;
import java.util.Collection;
import java.util.ArrayList;

/**
 *Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años. ++
 * 
 * Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail +
 * 
 * 
 * @author diego
 */
public final class FamiliaDAO extends DAO{
    
    public void insertarFamilia (Familia family){
    
    }
    
    public void modificarFamilia (Familia family){
    
    }
    
    public void eliminarFamilia (Familia family){
    
    }
    
    public Familia consultarFamilia(Integer codigoFamilia){
        return null;
    }
    
    public Collection<Familia> consultarFamilias (){
        return null;
    }
    
    public Collection <Familia> consultarFamiliasCantHijosMenosA3YEdadMenorA10() throws Exception{
        try {
            String sql = "Call consultar_familias_menos_3_hijos_y_mayores_de_10_anios();";
            ArrayList <Familia> listaDeFamilias = new ArrayList <>();
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                listaDeFamilias.add(new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getString(6), resultado.getInt(7)));
            }
            
            desconectarBD();
            
            return listaDeFamilias;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
    
    public Collection <Familia> consultarEmailsHotmail () throws Exception{
        try {
            String sql = "CALL familias_con_email_hotmail();";
            ArrayList <Familia> listaFamilias = new ArrayList<>();
            
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                listaFamilias.add(new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getString(6), resultado.getInt(7)));
            }
            
            desconectarBD();
            
            return listaFamilias;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
}
