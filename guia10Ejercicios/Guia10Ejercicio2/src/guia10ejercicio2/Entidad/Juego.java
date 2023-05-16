/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Entidad;

import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class Juego {
    ArrayList <Jugador> players;
    Revolver waterGun;
    
    public Juego(){}
    
    public Juego (ArrayList <Jugador> players, Revolver waterGun){
        this.players = players;
        this.waterGun = waterGun;
    }
    
    public void setPlayers (ArrayList <Jugador> players){
        this.players = players;
    }
    
    public void setRevolver (Revolver waterGun){
        this.waterGun = waterGun;
    }
    
    public ArrayList <Jugador> getPlayers (){
        return players;
    }
    
    public Revolver getWaterGun (){
        return waterGun;
    }

    @Override
    public String toString() {
        return "Juego{" + "players=" + players + ", waterGun=" + waterGun + '}';
    }
}
