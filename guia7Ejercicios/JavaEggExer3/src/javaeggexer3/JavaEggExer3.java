/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer3;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer3 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)  throws IOException{
        // TODO code application logic here
        
        String frase;
        
        System.out.println("Por favor ingrese una frase");
        
        frase = CONSOLE.readLine();
        System.out.println(frase.toUpperCase() + " | " + frase.toLowerCase());
    }
    
}
