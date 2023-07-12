/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Servicio;

import g14ex1.Entidades.Cliente;
import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Estancia;
import g14ex1.Persistencia.ClienteDAO;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author diego
 */
public class ClienteServicio {
    
    private ClienteDAO daoCliente;
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public ClienteServicio(){
        this.daoCliente = new ClienteDAO();
    }
    
    public void insertarCliente() throws Exception{
        try {
            System.out.println("""
                               Por favor ingrese los siguientes datos del cliente:
                               
                               1. Nombre
                               2. Calle
                               3. Número
                               4. Código postal
                               5. Ciudad
                               6. País
                               7. Email
                               """);
            Cliente client = new Cliente (null, INPUT.next(), INPUT.next(), INPUT.nextInt(), INPUT.next(), INPUT.next(), INPUT.next(), INPUT.next());
            daoCliente.insertarCliente(client);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public void consultarTodosLosClientes() throws Exception{
        try {
            daoCliente.consultarClientes().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public void listaDeClientesQueRealizaronEstancia () throws Exception{
        try {
            daoCliente.clientesQueRealizaronEstancia().stream().forEach(objeto -> {
                if(objeto instanceof Cliente cliente){
                    System.out.println(cliente.toString());
                }else if(objeto instanceof Estancia estancia){
                    System.out.println(estancia.toString());
                }else if (objeto instanceof Casa casa){
                    System.out.println(casa.toString());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
