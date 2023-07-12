/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Estancia;
import g14ex1.Servicio.ClienteServicio;
import g14ex1.Servicio.CasaServicio;

import java.util.Collection;

/**
 * Listar todas las estancias que han sido reservadas por un cliente, mostrar el
 * nombre, país y ciudad del cliente y además la información de la casa que
 * reservó. La que reemplazaría a la anterior
 *
 * Insertar nuevos datos en la tabla estancias verificando la disponibilidad de
 * las fechas.
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

    public void insertarEstancia(Estancia stay) {

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
}
