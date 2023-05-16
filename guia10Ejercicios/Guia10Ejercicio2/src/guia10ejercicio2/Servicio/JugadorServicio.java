/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Servicio;

import guia10ejercicio2.Entidad.Jugador;
import guia10ejercicio2.Entidad.Revolver;
/**
 *
 * @author diego
 */
public class JugadorServicio {
    
    private static int numeroJugador = 0;
    
    public Jugador crearJugadores(){
        return new Jugador(++numeroJugador, "Jugador", false);
    }
    
    public boolean disparo (Revolver waterGun){
        RevolverServicio rs = new RevolverServicio();
        rs.siguienteChorro(waterGun);
        return rs.mojar(waterGun);
    }
}
