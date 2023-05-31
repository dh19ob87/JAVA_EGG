/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer2.Servicio;

import guia11exer2.Entidad.Lavadora;
import guia11exer2.Enumerables.Color;
import guia11exer2.Enumerables.LetrasConsumo;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class LavadoraServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Lavadora crearLavadora(){
        System.out.println("Por favor ingrese la carga, color, letra del consumo energético y peso de la lavadora");
        return new Lavadora(INPUT.nextDouble(), 1000d, Color.ROJO, LetrasConsumo.C, INPUT.nextDouble());
    }
    
    public void imprimirData (Lavadora washer){
        System.out.println(washer.toString());
    }
}
