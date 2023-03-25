/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer12;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class JavaEggExer12 {
    
    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena;
        int correcto, incorrecto;
        correcto = incorrecto = 0;
        
        do {
            
            cadena = CONSOLE.nextLine();
            if(cadena.startsWith("X") && cadena.endsWith("O") && cadena.length() == 5){
                correcto ++;
            }else{
                incorrecto ++;
            }
            
        } while (cadena.compareTo("&&&&&") != 0);
        
        System.out.printf("Correctos: %d | Incorrectos: %d \n", correcto, incorrecto);
        
    }
    
}
