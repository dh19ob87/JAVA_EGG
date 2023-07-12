/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g14ex1;

import g14ex1.Servicio.CasaServicio;
import g14ex1.Servicio.ClienteServicio;
import g14ex1.Servicio.EstanciaServicio;

/**
 *
 * @author diego
 */
public class G14EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteServicio servicioCliente = new ClienteServicio();
        EstanciaServicio servicioEstancia = new EstanciaServicio();
        CasaServicio servicioCasa = new CasaServicio();

        try {
            System.out.println("""
                               Consultas cliente
                               
                               Consultar todos los clientes ->
                               
                               """);
            
            servicioCliente.consultarTodosLosClientes();
            
            System.out.println("""
                               Insertar un cliente
                               
                               """);
            
//            servicioCliente.insertarCliente();

            System.out.println("""
                               
                               Listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron. ->
                               
                               """);
            
            servicioCliente.listaDeClientesQueRealizaronEstancia();
            
            System.out.println("""
                               Consultas Estancias
                               
                               Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior ->
                               
                               """);
            
            servicioEstancia.consultarHistorialEstanciasPorCliente();
            
            System.out.println("""
                                Consultas casas
                               
                               Listar casas limpias.
                               
                               """);
            
            servicioCasa.listarCasasLimpias();
            
            System.out.println("""
                               
                               Obtener el número de casas que existen para cada uno de los países diferentes.
                               
                               """);
            
            servicioCasa.listarCantidadDeCasasPorPais();
            
            System.out.println("""
                               
                               Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.
                               
                               """);
            
            servicioCasa.listarPreciosActualizados();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
