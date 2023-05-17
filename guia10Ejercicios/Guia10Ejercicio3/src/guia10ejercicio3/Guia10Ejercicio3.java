/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10ejercicio3;

import guia10ejercicio3.Entidad.Baraja;
import guia10ejercicio3.Servicio.BarajaServicio;
/**
 *
 * @author diego
 */
public class Guia10Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarajaServicio bs = new BarajaServicio();
        Baraja deck = bs.crearBaraja();
        bs.imprimirBaraja(deck);
        bs.iniciarJuego(deck);
    }
    
}
