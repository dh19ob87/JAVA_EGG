/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g14ex1;

import g14ex1.Servicio.ClienteServicio;

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

        try {
            servicioCliente.consultarTodosLosClientes();
//            servicioCliente.insertarCliente();
            System.out.println("*******");
            servicioCliente.listaDeClientesQueRealizaronEstancia();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
