/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer2.Servicio;

import guia11exer2.Entidad.Televisor;
import guia11exer2.Enumerables.Color;
import guia11exer2.Enumerables.LetrasConsumo;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class TelevisorServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Televisor crearTelevisor (){
        System.out.println("Por favor ingrese la resolución, si es tdt, color, letra consumo y peso del tv");
        return new Televisor(INPUT.nextDouble(), INPUT.nextBoolean(), 1000d, Color.ROJO, LetrasConsumo.C, INPUT.nextDouble());
    }
    
    public void imprimirDatos (Televisor tv){
        System.out.println(tv.toString());
    }
}
