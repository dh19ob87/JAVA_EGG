/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Entidad.Barco;
import java.util.Locale;
import java.util.Scanner;
import java.time.Year;
/**
 *
 * @author diego
 */
public class BarcoServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Barco crearBarco(){
        System.out.println("Por favor ingrese la matrícula, eslora y año de fabricación del barco");
        return new Barco(INPUT.nextLong(), INPUT.nextDouble(), Year.of(INPUT.nextInt()));
    }
    
    public void imprimirDataBarco(Barco boat){
        System.out.println(boat.toString());
    }
}
