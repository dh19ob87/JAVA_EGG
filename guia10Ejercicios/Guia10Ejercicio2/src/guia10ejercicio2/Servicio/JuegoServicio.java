/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio2.Servicio;

import guia10ejercicio2.Entidad.Juego;
import guia10ejercicio2.Entidad.Jugador;
import guia10ejercicio2.Entidad.Revolver;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author diego
 */
public class JuegoServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Juego crearJuego() {
        return new Juego();
    }

    public void llenarJuego(Juego game) {
        int cantidadJugadores = 0;
        JugadorServicio js = new JugadorServicio();
        RevolverServicio rs = new RevolverServicio();

        System.out.println("Bienvenido. \nPor favor ingrese la cantidad de jugadores. | Min: 1 - Max: 6.");

        do {
            cantidadJugadores = INPUT.nextInt();
            if(cantidadJugadores <1 || cantidadJugadores > 6){
                System.out.println("Mínimo 1 jugador máximo 6");
            }
        } while (cantidadJugadores < 1 || cantidadJugadores > 6);

        ArrayList<Jugador> players = new ArrayList<>();
        for (int i = 0; i < cantidadJugadores; i++) {
            players.add(js.crearJugadores());
        }

        game.setPlayers(players);
        game.setRevolver(new Revolver());
        rs.llenarRevolver(game.getWaterGun());
    }

    public void ronda(Juego game) {
        JugadorServicio ps = new JugadorServicio();
        long seconds = 1;
        Timer pausa = new Timer("incertidumbre");
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {
                    for (Jugador player : game.getPlayers()) {
                        System.out.println("Tu turno " + player.getNombre());
                        TimeUnit.SECONDS.sleep((long) (seconds + Math.random() * 5 + 1));
                        System.out.println("BOOOOM");
                        TimeUnit.SECONDS.sleep((long) (seconds + Math.random() * 5 + 1));
                        if (ps.disparo(game.getWaterGun())) {
                            System.out.print("Perdiste " + player.getNombre() + " -> ");
                            System.out.println(game.getWaterGun().toString());
                            pausa.cancel();
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                do {
//                    for (Jugador player : game.getPlayers()) {
//                        if (ps.disparo(game.getWaterGun())) {
//                            System.out.println("Perdiste " + player.getNombre());
//                            System.out.println(game.getWaterGun().toString());
//                            dead = true;
//                            break;
//                        } else {
//                            System.out.println("Turno de " + player.getNombre());
//                        }
//                    }
//                } while (!dead);
            }
        };

        pausa.schedule(task, seconds, (long) (Math.random() * 4 + 1 + seconds));
    }
    
// Método sin delays    
//    public void ronda(Juego game) {
//        JugadorServicio ps = new JugadorServicio();
//         boolean dead = false;
//        
//        do {
//            for (Jugador player : game.getPlayers()) {
//                if (ps.disparo(game.getWaterGun())) {
//                    System.out.println("Perdiste " + player.getNombre());
//                    System.out.println(game.getWaterGun().toString());
//                    dead = true;
//                    break;
//                } else {
//                    System.out.println("Turno de " + player.getNombre());
//                }
//            }
//          } while (!dead);
//    }
}
