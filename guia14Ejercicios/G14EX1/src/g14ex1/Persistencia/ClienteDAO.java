/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Cliente;
import java.util.Collection;
/**
 *
 * @author diego
 */
public class ClienteDAO extends DAO{
    
    public void insertarCliente (Cliente client){
        String sql = "{call AGREGAR_CLIENTE}";
    }
    
    public void modificarCliente (Cliente client){
    
    }
    
    public void eliminarCliente (Cliente client){
        
    }
    
    public Cliente buscarCliente (Integer codigoCliente){
        return null;
    }
    
    public Collection<Cliente> consultarClientes(){
        return null;
    }
}
