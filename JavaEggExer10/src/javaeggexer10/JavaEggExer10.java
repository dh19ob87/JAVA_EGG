/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer10;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExer10 {

    /**
     * @param args the command line arguments
     */
    
   private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int limite_superior, sumatoria;
        sumatoria = 0;
        
        System.out.println("Por favor ingrese el límite superior de la sumatoria:");
        limite_superior = CONSOLE.nextInt();
        
        do {
            System.out.println("Por favor ingrese un número");
            sumatoria += CONSOLE.nextInt();
        } while (sumatoria <= limite_superior);
        
        System.out.printf("Limite superior = %d | Sumatoria = %d", limite_superior, sumatoria);
    }
    
}
