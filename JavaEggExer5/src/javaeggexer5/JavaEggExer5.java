/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer5 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        int x;
        
        System.out.println("Ingrese un número");
        x = Integer.parseInt(CONSOLE.readLine());
        
        System.out.printf("x^2 = %f, x^3 = %f, sqrt(x) = %f \n", Math.pow(x, 2), Math.pow(x, 3), Math.sqrt(x));
    }
    
}
