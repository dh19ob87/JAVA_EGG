/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Cliente;
import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Estancia;
import g14ex1.Servicio.CasaServicio;
import g14ex1.Servicio.EstanciaServicio;
import java.util.Collection;

/**
 * Listar los datos de todos los clientes que en algún momento realizaron una
 * estancia y la descripción de la casa donde la realizaron.
 *
 * @author diego
 */
public final class ClienteDAO extends DAO {
    
    private final CasaServicio casaServicio;
    
    public ClienteDAO (){
        this.casaServicio = new CasaServicio();
    }
    
    public void insertarCliente(Cliente client) {
        String sql = "{call AGREGAR_CLIENTE}";
    }

    public void modificarCliente(Cliente client) {

    }

    public void eliminarCliente(Cliente client) {

    }

    public Cliente buscarCliente(Integer codigoCliente) {
        return null;
    }

    public Collection<Cliente> consultarClientes() {
        return null;
    }
}
