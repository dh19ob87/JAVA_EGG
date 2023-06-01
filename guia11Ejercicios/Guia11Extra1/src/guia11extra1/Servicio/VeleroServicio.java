/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Entidad.Velero;
import java.util.Scanner;
import java.time.Year;
import java.util.Locale;
/**
 *
 * @author diego
 */
public class VeleroServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Velero crearVelero (){
        System.out.println("Por favor ingrese la cantidad de mastiles, matrícula, eslora y año de fabricación del velero:");
        return new Velero(INPUT.nextInt(), INPUT.nextLong(), INPUT.nextDouble(), Year.of(INPUT.nextInt()));
    }
    
    public void printDataVelero (Velero barcoVelero){
        System.out.println(barcoVelero.toString());
    }
}
