/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public abstract class DAO {
    
    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultado;
    protected PreparedStatement preparedStatement;
    protected CallableStatement storedProcedure;
    
    private final String USER = "dh19ob87";
    private final String PASSWORD = "Clothing4_Mush_Earthly5_Unstuffed7_dilate_Swivel0_Ziti3_unhinge_Dork";
    private final String DATABASE = "estancias_exterior";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBD() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(DRIVER);
            String urlBD = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBD, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            throw e;
        }
    }
    
    protected void desconectarBD() throws Exception, SQLException{
        try {
            if(resultado != null){
                resultado.close();
            }
            
            if(sentencia != null){
                sentencia.close();
            }
            
            if(preparedStatement != null){
                preparedStatement.close();
            }
            
            if(storedProcedure != null){
                storedProcedure.close();
            }
            
            if(conexion != null){
                conexion.close();
            }
        } catch (SQLException e){
            throw e;
        } catch (Exception e) {  
            throw e;
        }
    }
    
    protected void cudBD(String sql) throws ClassNotFoundException, SQLException, Exception{
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
        } catch (ClassNotFoundException | SQLException e){
            conexion.rollback();
            throw e;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBD();
        }
    }
    
    protected void rBD (String sql) throws ClassNotFoundException, SQLException, Exception{
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    /**
     * https://docs.oracle.com/javase/tutorial/jdbc/basics/storedprocedures.html
     * Notas:
     * Si el parámetro es IN entonces se setea. Utilizamos storedprocedure.setDataType(posicion, valor);
     * Si el parámetro es OUT entonces se registra. Utilizamos storedProcedure.registerOutParameter(posicion, tipo en MySQL [java.sql.Types.DataType])
     * Si el parámetro es INOUT entonces se realizan las dos operaciones anteriores.
     * @param sql
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws Exception 
     */
    protected void callStoredProcedure(String sql) throws ClassNotFoundException, SQLException, Exception{
        try {
            conectarBD();
            storedProcedure = conexion.prepareCall(sql);
            storedProcedure.registerOutParameter(1, java.sql.Types.INTEGER);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
}
