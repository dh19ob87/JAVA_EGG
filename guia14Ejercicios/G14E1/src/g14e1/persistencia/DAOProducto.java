/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.persistencia;

import g14e1.Entidades.Producto;
import g14e1.Servicio.FabricanteServicio;
import java.util.ArrayList;

import java.util.Collection;

/**
 * Se crea el CRUD
 *
 * @author diego
 */
public final class DAOProducto extends DAO {

    private final FabricanteServicio fs;

    public DAOProducto() {
        this.fs = new FabricanteServicio();
    }

    public void agregarProducto() {

    }

    public void modificarProducto() {

    }

    public void eliminarProducto() {

    }

    public Producto datosProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio = (SELECT MIN(precio) FROM producto);";
            consultarBD(sql);
            Producto product = null;
            while (resultado.next()) {
                product = new Producto(null, resultado.getString(1), resultado.getDouble(2), null);
            }
            desconectarBD();
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBD();
            throw e;
        }
    }

    public Collection<Producto> listarTodosLosProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";
            consultarBD(sql);
            Producto product = null;
            Collection<Producto> listaDeProductos = new ArrayList<>();

            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigoFabricante(resultado.getInt(4));
                listaDeProductos.add(product);
            }
            desconectarBD();
            return listaDeProductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBD();
            throw e;
        }
    }

    /**
     * DEBES AGREGAR LA INFORMACIÖN DEL FABRICANTE
     *
     * @param limiteInferior
     * @param limiteSuperior
     * @return
     * @throws Exception
     */
    public Collection<Producto> listarProductosEnIntervaloDePrecio(int limiteInferior, int limiteSuperior) throws Exception {
        try {
            conectarBD();
            query = conexion.prepareStatement("SELECT * FROM producto WHERE precio BETWEEN ? AND ?;");
            query.setInt(1, limiteInferior);
            query.setInt(2, limiteSuperior);
            resultado = query.executeQuery();
            Collection<Producto> listaDeproductos = new ArrayList<>();

            while (resultado.next()) {
                listaDeproductos.add(new Producto(resultado.getInt("codigo"), resultado.getString("nombre"), resultado.getDouble("precio"), resultado.getInt("codigo_fabricante")));
            }

            return listaDeproductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBD();
            throw e;
        }
    }

    public Collection<Producto> consultarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portátil%';";
            consultarBD(sql);

            Collection<Producto> listaDeProductos = new ArrayList<>();

            while (resultado.next()) {
                listaDeProductos.add(new Producto(resultado.getInt("codigo"), resultado.getString("nombre"), resultado.getDouble("precio"), resultado.getInt("codigo_fabricante")));
            }

            return listaDeProductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBD();
            throw e;
        }
    }
}
