/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra6.Entidad;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class Ahorcado {
    private String [] palabraABuscar;
    private int letrasEncontradas;
    private int cantidaJugadasMaximas;
    private int intentosUsados;
    private ArrayList <String> letrasFaltantes = new ArrayList<>();
    
    public Ahorcado (){}
    
    public Ahorcado (String [] palabraABuscar, int letrasEncontradas, int cantidadJugadasMaximas){
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.intentosUsados = 0;
        this.cantidaJugadasMaximas = cantidadJugadasMaximas;
    }
    
    public void setPalabraABuscar (String [] palabraABuscar){
        this.palabraABuscar = palabraABuscar;
    }
    
    public void setLetrasEncontradas (int letrasEncontradas){
        this.letrasEncontradas = letrasEncontradas;
    }
    
    public void setCantidadJugadasMaximas (int cantidadJugadasMaximas){
        this.cantidaJugadasMaximas = cantidadJugadasMaximas;
    }
    
    public void setIntentosUsados (int intentosUsados){
        this.intentosUsados = intentosUsados;
    }
    
    public void setLetrasFaltantes (ArrayList <String> letrasFaltantes){
        this.letrasFaltantes = letrasFaltantes;
    }
    
    public String [] getPalabraABuscar(){
        return palabraABuscar;
    }
    
    public int getLetrasEncontradas (){
        return letrasEncontradas;
    }
    
    public int getCantidadJugadasMaximas (){
        return cantidaJugadasMaximas;
    }
    
    public int getIntentosUsados (){
        return intentosUsados;
    }
    
    public ArrayList getLetrasFaltantes (){
        return letrasFaltantes;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraABuscar=" + palabraABuscar + ", letrasEncontradas=" + letrasEncontradas + ", cantidaJugadasMaximas=" + cantidaJugadasMaximas + '}';
    }
}
