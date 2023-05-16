/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Servicio;

import guia10ejercicio2.Entidad.Revolver;
/**
 *
 * @author diego
 */
public class RevolverServicio {
    public Revolver crearRevolver (){
        return new Revolver();
    }
    
    public void llenarRevolver (Revolver waterGun){
        waterGun.setPosicionAgua((int) (Math.random() * 10 + 1));
        waterGun.setPosicionActual((int) (Math.random() * 10 + 1));
    }
    
    public boolean mojar(Revolver waterGun){
        return waterGun.getPosicionActual() == waterGun.getPosicionAgua();
    }
    
    public void siguienteChorro (Revolver waterGun){
        waterGun.setPosicionActual((int) (Math.random() * 10 + 1));
    }
}
