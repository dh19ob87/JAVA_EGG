/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra8.Servicio;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import javapooeggexerextra8.Entidad.Tiempo;

/**
 *
 * @author diego
 */
public class TiempoServicio {

    public Tiempo crearHora() {
        System.out.println("Por favor ingrese hora en formato 24 horas. Horas: minutos : segundos, respectivamente");
        return new Tiempo(validarTiempo(1), validarTiempo(2),validarTiempo(3));
    }
    
    public void runTime(Tiempo time){
        Timer intervaloTarea = new Timer("Reloj simulado");
        TimerTask tarea = new TimerTask() {
            int detener = 0;
            @Override
            public void run() {
                if(detener == 120){
                    intervaloTarea.cancel();
                }else{
                    detener ++;
                    time.setTime(time.getTime().plusSeconds(1));
                    System.out.println((time.getTime().getSecond() == 0) ? time.toString() + ":00" : time.toString());
                }
            }
        };
        
        intervaloTarea.scheduleAtFixedRate(tarea, 0, 1000);
    }

    /**
     * mode = 1, valida horas. mode = 2, valida minutos. mode = 3, valida
     * segundos.
     *
     * @param mode
     * @return int
     */
    public int validarTiempo(int mode) {

        int section;

        do {
            section = new Scanner(System.in).useDelimiter("\n").nextInt();
            switch (mode) {
                case 1:
                    mode = (section >= 0 && section <= 24) ? 0 : 1;
                    break;
                case 2:
                    mode = (section >= 0 && section <= 60) ? 0 : 2;
                    break;
                case 3:
                    mode = (section >= 0 && section <= 60) ? 0 : 3;
                    break;
                default:
                    System.out.println("Error en la lectura por favor intente de nuevo");
            }
            
            if(Pattern.matches("[1-3]", String.valueOf(mode))){
                System.out.println("Por favor ingrese la hora en formato 24 horas.\n Recuerde que: Horas [0, 24] | Minutos y segundos: [0, 60]");
            }
        } while (mode != 0);

        return section;
    }
}
