/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Entidad.YateLujo;
import java.util.Scanner;
import java.time.Year;
import java.util.Locale;
/**
 *
 * @author diego
 */
public class YateLujoServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public YateLujo crearyateDeLujo(){
        System.out.println("Por favor ingrese la cantidad de camarotes, potencia del motor, matrícula, eslora y año de fabricación del barco");
        return new YateLujo(INPUT.nextInt(), INPUT.nextDouble(), INPUT.nextLong(), INPUT.nextDouble(), Year.of(INPUT.nextInt()));
    }
    
    public void printDataYateDeLujo(YateLujo yate){
        System.out.println(yate.toString());
    }
}
