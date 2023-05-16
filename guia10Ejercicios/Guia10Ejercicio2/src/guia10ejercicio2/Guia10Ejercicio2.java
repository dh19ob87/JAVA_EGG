/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10ejercicio2;

import guia10ejercicio2.Entidad.Juego;
import guia10ejercicio2.Servicio.JuegoServicio;
/**
 *
 * @author diego
 */
public class Guia10Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JuegoServicio js =  new JuegoServicio();
        Juego game = js.crearJuego();
        js.llenarJuego(game);
        js.ronda(game);
    }
    
}
