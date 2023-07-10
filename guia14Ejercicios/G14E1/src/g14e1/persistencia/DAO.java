/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.persistencia;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public abstract class DAO {

    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultado;
    protected PreparedStatement query;
    
    private final String USER = "dh19ob87";
    private final String PASSWORD = "Clothing4_Mush_Earthly5_Unstuffed7_dilate_Swivel0_Ziti3_unhinge_Dork";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    /**
     * Se encarga de establecer conexión con la BD
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    protected void conectarBD() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    /**
     * Desconecta la BD
     * @throws Exception
     * @throws SQLException 
     */
    protected void desconectarBD() throws Exception, SQLException{
        try {
            if(resultado != null){
                resultado.close();
            }
            
            if(sentencia != null){
                sentencia.close();
            }
            
            if(conexion != null){
                conexion.close();
            }
        } catch (SQLException e) {
            throw e;
        } catch (Exception e){
            throw e;
        }
    }
    
    /**
     * Ejecuta UPDATE, DELETE, INSERT
     * @param sql
     * @throws java.lang.ClassNotFoundException
     * @throws SQLException 
     */
    protected void insertarModificarEliminar (String sql) throws ClassNotFoundException, SQLException, Exception{
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            conexion.rollback();
            throw e;
        }catch(Exception e){
            throw e;
        }finally {
            desconectarBD();
        }
    }
    
    protected void consultarBD(String sql) throws Exception{
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
