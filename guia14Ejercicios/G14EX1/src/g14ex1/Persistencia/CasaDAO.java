/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Comentario;
import g14ex1.Servicio.ComentarioServicio;
import java.time.LocalDate;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas
 * (comentarios) que están ‘limpias’ ++
 *
 * Obtener el número de casas que existen para cada uno de los países
 * diferentes. ++
 *
 * Debido a la devaluación de la libra esterlina con respecto al euro se desea
 * incrementar el precio por día en un 5% de todas las casas del Reino Unido.
 * Mostar los precios actualizados. ++
 *
 * Consulta la BD para que te devuelva aquellas casas disponibles a partir de
 * una fecha dada y un número de días específico. +
 *
 * Buscar y listar las casas disponibles para el periodo comprendido entre el 1
 * de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido. +
 *
 * @author diego
 */
public final class CasaDAO extends DAO {

    private final ComentarioServicio comentarioServicio;

    public CasaDAO() {
        this.comentarioServicio = new ComentarioServicio();
    }

    public void insertarCasa(Casa house) {

    }

    public void modificarCasa(Casa house) {

    }

    public void eliminarCasa(Casa house) {

    }

    public Casa consultarCasa(Integer codigoCasa) throws Exception {
        try {
            Casa house = null;
            String sql = "CALL consultar_casa (" + codigoCasa + ");";
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                house = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), LocalDate.of(resultado.getDate(7).getYear(), resultado.getDate(7).getMonth(), resultado.getDate(7).getDay()), LocalDate.of(resultado.getDate(8).getYear(), resultado.getDate(8).getMonth(), resultado.getDate(8).getDay()), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12));
            }
            
            desconectarBD();
            return house;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }

    public Collection<Casa> consultarCasas() {
        return null;
    }
    
    public Collection <Object> consultarCasasLimpias() throws Exception{
        try {
            String sql = "CALL casas_limpias_del_reino_unido();";
            Comentario comment = null;
            Casa house = null;
            ArrayList <Object> listaDeObjetos = new ArrayList<>();
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                house = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), LocalDate.of(resultado.getDate(7).getYear(), resultado.getDate(7).getMonth(), resultado.getDate(7).getDay()), LocalDate.of(resultado.getDate(8).getYear(), resultado.getDate(8).getMonth(), resultado.getDate(8).getDay()), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12));
                comment = new Comentario(null, null, resultado.getString(13));
                listaDeObjetos.add(house);
                listaDeObjetos.add(comment);
            }
            
            desconectarBD();
            return listaDeObjetos;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
    
    public HashMap<String, Integer> consultarCantidadDeCasasPorPais() throws Exception{
        try {
            String sql = "CALL numero_de_casas_por_pais();";
            
            HashMap <String, Integer> listaCasas = new HashMap<>();
            
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                listaCasas.put(resultado.getString(2), resultado.getInt(1));
            }
            
            desconectarBD();
            return listaCasas;
            
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
    
    public HashMap<Integer, Double> aumentarPrecioHabitacion(int porcentaje) throws Exception{
        
        try {
            String sql = "CALL actualizar_precio_habitacion(" + porcentaje + ")";
            HashMap <Integer, Double> listaPrecios = new HashMap<>();
            callStoredProcedureR(sql);
            
            while(resultado.next()){
                listaPrecios.put(resultado.getInt(1), resultado.getDouble(2));
            }
            
            desconectarBD();
            return listaPrecios;
        } catch (Exception e) {
            desconectarBD();
            throw e;
        }
    }
}
