/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer6;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExer6 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x;
        
        x = CONSOLE.nextInt();
        
        System.out.printf("¿Es par? %b \n", (x%2 == 0));
    }
    
}
