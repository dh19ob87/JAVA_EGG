/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10extra4;

//import guia10extra4.Utilidades.RandomUser;
import guia10extra4.Servicio.SimuladorServicio;

/**
 *
 * @author diego
 */
public class Guia10Extra4 {

    public static void main(String[] args) {
//        RandomUser.getUsuarios(100).forEach(System.out::println);
        SimuladorServicio simularElecciones = new SimuladorServicio();
        simularElecciones.iniciarSimulacion();
    }
}