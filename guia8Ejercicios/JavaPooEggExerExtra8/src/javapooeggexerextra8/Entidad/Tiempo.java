/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra8.Entidad;

import java.time.LocalTime;

/**
 *
 * @author diego
 */
public class Tiempo {

    private LocalTime time;

    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.time = LocalTime.of(horas, minutos, segundos);
    }
    
    public void setTime(LocalTime time){
        this.time = time;
    }
    
    public LocalTime getTime(){
        return time;
    }
    
    @Override
    public String toString(){
        return time.toString();
    }

}
