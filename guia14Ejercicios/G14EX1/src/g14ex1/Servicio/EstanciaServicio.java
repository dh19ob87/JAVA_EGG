/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Servicio;

import g14ex1.Entidades.Estancia;
import g14ex1.Persistencia.EstanciaDAO;
import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Cliente;

/**
 *
 * @author diego
 */
public class EstanciaServicio {
    
    private EstanciaDAO daoEstancia;
    
    public EstanciaServicio(){
        this.daoEstancia = new EstanciaDAO();
    }
    
    public void consultarHistorialEstanciasPorCliente() throws Exception{
        try {
            daoEstancia.consultarEstanciasDataCliente().stream().forEach(objeto -> {
                if(objeto instanceof Cliente cliente){
                    System.out.println(cliente.toString());
                }else if(objeto instanceof Casa casa){
                    System.out.println(casa.toString());
                }
            });
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void insertarEstancia(){
        
    }
    
}
