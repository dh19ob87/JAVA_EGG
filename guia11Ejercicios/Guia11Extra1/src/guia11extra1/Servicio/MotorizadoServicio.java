/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Entidad.Motorizado;
import java.util.Scanner;
import java.time.Year;
import java.util.Locale;
/**
 *
 * @author diego
 */
public class MotorizadoServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Motorizado crearBarcoMotorizado(){
        System.out.println("Por favor ingrese la potencia del motor, matrícula, eslora y año de fabricación del barco");
        return new Motorizado(INPUT.nextDouble(), INPUT.nextLong(), INPUT.nextDouble(), Year.of(INPUT.nextInt()));
    }
    
    public void printDataMotorizado(Motorizado engineBoat){
        System.out.println(engineBoat.toString());
    }
}
