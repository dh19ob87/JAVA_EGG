/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Estancia;
import g14ex1.Entidades.Cliente;
import g14ex1.Entidades.Casa;
import g14ex1.Servicio.ClienteServicio;
import g14ex1.Servicio.CasaServicio;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Collection;

/**
 * Listar todas las estancias que han sido reservadas por un cliente, mostrar el
 * nombre, país y ciudad del cliente y además la información de la casa que
 * reservó. La que reemplazaría a la anterior +
 *
 * Insertar nuevos datos en la tabla estancias verificando la disponibilidad de
 * las fechas. +?
 *
 * @author diego
 */
public final class EstanciaDAO extends DAO {

    private final ClienteServicio clienteServicio;
    private final CasaServicio casaServicio;

    public EstanciaDAO() {
        this.clienteServicio = new ClienteServicio();
        this.casaServicio = new CasaServicio();
    }

    public void insertarEstancia(Estancia stay) throws Exception{
        try {
            if(clienteServicio.existeElCliente(stay.getIdCliente())){
                throw new Exception("El cliente no existe.");
            }
            
            if(casaServicio.existeLaCasa(stay.getIdCasa())){
                throw new Exception("La casa no existe.");
            }
            
            if(casaServicio.hayCasasDisponibles(stay.getFechaDesde(), stay.getFechaHasta())){
                throw new Exception("No hay casas disponibles en esas fechas.");
            }
            
            StringBuilder sql = new StringBuilder();
            sql.append("CALL insertar_estancia(");
            sql.append(stay.getIdCliente()).append(", ");
            sql.append(stay.getIdCasa()).append(", ");
            sql.append("'").append(stay.getNombreHuesped()).append("', ");
            sql.append("'").append(stay.getFechaDesde().getYear()).append("-").append(stay.getFechaDesde().getMonthValue()).append("-").append(stay.getFechaDesde().getDayOfMonth()).append("', ");
            sql.append("'").append(stay.getFechaHasta().getYear()).append("-").append(stay.getFechaHasta().getMonthValue()).append("-").append(stay.getFechaHasta().getDayOfMonth()).append("'");
            sql.append(");");
            
            callStoredProcedureCud(sql.toString());
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarEstancia(Estancia stay) {

    }

    public void eliminarEstancia(Estancia stay) {

    }

    public Estancia consultarEstancia(Integer codigoEstancia) {
        return null;
    }

    public Collection<Estancia> consultarEstancias() {
        return null;
    }
    
    public Collection<Object> consultarEstanciasDataCliente() throws Exception{
        try {
            String sql = "CALL consultar_historial_clientes_estancia();";
            Cliente client = null;
            Casa house = null;
            ArrayList<Object> listaDeObjetos = new ArrayList<>();
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                client = new Cliente(null, resultado.getString(1), null, null, null, resultado.getString(3), resultado.getString(2), null);
                house = new Casa(resultado.getInt(4), resultado.getString(5), resultado.getInt(6), resultado.getString(7), resultado.getString(8), resultado.getString(9), resultado.getDate(10).toLocalDate(), resultado.getDate(11).toLocalDate(), resultado.getInt(12), resultado.getInt(13), resultado.getDouble(14), resultado.getString(15));
                listaDeObjetos.add(client);
                listaDeObjetos.add(house);
            }
            
            desconectarBD();
            return listaDeObjetos;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
}
