/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Entidad;

/**
 *
 * @author diego
 */
public class Jugador {
    private int idJugador;
    private String nombre;
    private boolean mojado;
    
    public Jugador (){}
    
    public Jugador (int idJugador, String nombre, boolean mojado){
        this.idJugador = idJugador;
        this.nombre = "Jugador " + idJugador;
        this.mojado = mojado;
    }
    
    public void setIdJugador(int idJugador){
        this.idJugador = idJugador;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setMojado (boolean mojado){
        this.mojado = mojado;
    }
    
    public int getIdJugador (){
        return idJugador;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public boolean mojado(){
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
}
