/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Servicio;

import guia10ejercicio2.Entidad.Juego;
import guia10ejercicio2.Entidad.Jugador;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class JuegoServicio {
    public Juego crearJuego (){
        return new Juego();
    }
    
    public void llenarJuego (Juego game){
        ArrayList <Jugador> players = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
