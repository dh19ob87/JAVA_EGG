/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer8;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExer8 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        String chain;
        chain = CONSOLE.nextLine();
        System.out.printf("%s \n", (chain.length() > 8 || chain.length() < 0) ? "INCORRECTO" : "CORRECTO");
    }
    
}
