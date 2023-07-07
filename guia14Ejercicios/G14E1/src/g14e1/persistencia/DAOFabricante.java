/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.persistencia;

import g14e1.Entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

/**
 * CRUD
 *
 * @author diego
 */
public final class DAOFabricante extends DAO {

    public DAOFabricante() {
    }

    public void agregarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe enviar una instancia inicializada.");
            }

            String sql = "INSERT INTO fabricante (codigo, nombre) VALUES (" + fabricante.getCodigo() + ", ' " + fabricante.getNombre() + "' ;";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un el fabricante a modificar");
            }

            String sql = "UPDATE fabricante SET" + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = " + fabricante.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "DELETE FROM fabricante WHERE codigo = " + fabricante.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Fabricante> listarNombreDeTodosLosFabricantes() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante;";
            consultarBD(sql);
            
            Fabricante fabricante = null;
            Collection <Fabricante> listaFabricantes = new ArrayList<>();
            
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                listaFabricantes.add(fabricante);
            }
            
            desconectarBD();
            return listaFabricantes;
            
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBD();
            throw e;
        }
    }
}
