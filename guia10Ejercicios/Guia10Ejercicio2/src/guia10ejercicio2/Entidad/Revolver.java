/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Entidad;

/**
 *
 * @author diego
 */
public class Revolver {
    private int posicionActual;
    private int posicionAgua;
    
    public Revolver (){}
    
    public Revolver (int posicionActual, int posicionAgua){
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    public void setPosicionActual (int posicionActual){
        this.posicionActual = posicionActual;
    }
    
    public void setPosicionAgua (int posicionAgua){
        this.posicionAgua = posicionAgua;
    }
    
    public int getPosicionActual(){
        return posicionActual;
    }
    
   public int getPosicionAgua(){
       return posicionAgua;
   }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
}
