/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Servicio;

import g14ex1.Entidades.Estancia;
import g14ex1.Persistencia.EstanciaDAO;
import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Cliente;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EstanciaServicio {
    
    private EstanciaDAO daoEstancia;
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public EstanciaServicio(){
        this.daoEstancia = new EstanciaDAO();
    }
    
    public void consultarHistorialEstanciasPorCliente() throws Exception{
        try {
            daoEstancia.consultarEstanciasDataCliente().stream().forEach(objeto -> {
                if(objeto instanceof Cliente cliente){
                    System.out.println(cliente.toString());
                }else if(objeto instanceof Casa casa){
                    System.out.println(casa.toString());
                }
            });
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void insertarEstancia() throws Exception{
        try{
            Estancia stay = new Estancia();
            System.out.println("""
                               Por favor ingrese los siguientes datos de la estadía:

                               1. Id del cliente
                               2. id de la casa
                               3. Nombre del huesped
                               4. Fecha de ingreso
                               5. Fecha de salida                      
                               """);
            stay.setIdEstancia(0);
            stay.setIdCliente(INPUT.nextInt());
            stay.setIdCasa(INPUT.nextInt());
            stay.setNombreHuesped(INPUT.next());
            
            System.out.println("Por favor indique el año, mes y dia de la fecha de ingreso: ");
            stay.setFechaDesde(LocalDate.of(INPUT.nextInt(), INPUT.nextInt(), INPUT.nextInt()));
            
            System.out.println("Por favor indique el año, mes y día de la fecha de salida: ");
            
            stay.setFechaHasta(LocalDate.of(INPUT.nextInt(), INPUT.nextInt(), INPUT.nextInt()));
            
            daoEstancia.insertarEstancia(stay);
        }catch(Exception e){
            throw e;
        }
    }
    
}
