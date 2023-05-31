/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Servicio;

import guia11exer1.Entidad.Caballo;
import guia11exer1.Enumerables.RazaCaballo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CaballoServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Caballo crearCaballo(){
        System.out.println("Por favor ingrese el nombre, alimento, edad y raza del caballo");
        return new Caballo(INPUT.next(), INPUT.next(), INPUT.nextInt(), RazaCaballo.ARABES);
    }
    
    public void sonar(Caballo horse){
        horse.sonidoAnimal();
    }
}
