/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer7 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String chain;
        
        chain = CONSOLE.readLine();
        
        System.out.printf("%s \n", (chain.compareTo("eureka") == 0) ? "CORRECTO" : "INCORRECTO");
    }
    
}
