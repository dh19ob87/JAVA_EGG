/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer4;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExer4 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        float celsius;
        
        System.out.println("Por favor ingrese la temperatura en Celsius");
        celsius = CONSOLE.nextFloat();
        System.out.printf("F = 32 + (9 * (%f/5)) =  %f F \n", celsius, (32 + (9 * (celsius/5))));
    }
    
}
