/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Cliente;
import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Estancia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Listar los datos de todos los clientes que en algún momento realizaron una
 * estancia y la descripción de la casa donde la realizaron. ++
 *
 * @author diego
 */
public final class ClienteDAO extends DAO {

    public void insertarCliente(Cliente client) throws Exception{

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("CALL insertar_cliente('").append(client.getNombre()).append("'").append(",");
            sql.append("'").append(client.getCalle()).append("'").append(",");
            sql.append(client.getNumero()).append(",");
            sql.append("'").append(client.getCodigoPostal()).append("'").append(",");
            sql.append("'").append(client.getCiudad()).append("'").append(",");
            sql.append("'").append(client.getPais()).append("'").append(",");
            sql.append("'").append(client.getEmail()).append("'");
            sql.append(");");
            
            callStoredProcedureCud(sql.toString());
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCliente(Cliente client) {

    }

    public void eliminarCliente(Cliente client) {

    }

    public Cliente buscarCliente(Integer codigoCliente) throws Exception{
        try {
            Cliente client = null;
            String sql = "CALL consultar_un_cliente(" + codigoCliente + ");";
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                client = new Cliente(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8));
            }
            
            desconectarBD();
            return client;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }

    public Collection<Cliente> consultarClientes() throws Exception{
        try {
            String sql = "CALL consultar_todos_los_clientes();";
            Cliente client = null;
            ArrayList <Cliente> listaClientes = new ArrayList<>();
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                client = new Cliente(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8));
                listaClientes.add(client);
            }
            desconectarBD();
            return listaClientes;
        } catch (Exception e) {
            desconectarBD();
            e.printStackTrace();
            throw e;
        }
    }
    
    public Collection <Object> clientesQueRealizaronEstancia () throws Exception{
        try {
            String sql ="CALL consultar_clientes_que_contrataron_estancias()";
            Cliente client = null;
            Estancia stay = null;
            Casa house = null;
            ArrayList <Object> listaClienteEstaciaCasa = new ArrayList<>();
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                client = new Cliente(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8));
                stay = new Estancia(resultado.getInt(9), resultado.getInt(10), resultado.getInt(11), resultado.getString(12), resultado.getDate(13).toLocalDate(), resultado.getDate(14).toLocalDate());
                house = new Casa(resultado.getInt(15), resultado.getString(16), resultado.getInt(17), resultado.getString(18), resultado.getString(19), resultado.getString(20), resultado.getDate(21).toLocalDate(), resultado.getDate(22).toLocalDate(), resultado.getInt(23), resultado.getInt(24), resultado.getDouble(25), resultado.getString(26));
                listaClienteEstaciaCasa.add(client);
                listaClienteEstaciaCasa.add(stay);
                listaClienteEstaciaCasa.add(house);
            }
            
            desconectarBD();
            return listaClienteEstaciaCasa;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
}
