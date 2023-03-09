/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra22;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra22 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int A,B,C,D, AUX;
        
        A = (int) (Math.random() * 10);
        B = (int) (Math.random() * 10);
        C = (int) (Math.random() * 10);
        D = (int) (Math.random() * 10);
        
        System.out.println(A + " " + B +  " " + C + " " + D);
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D =AUX;
        
        System.out.println(A + " " + B +  " " + C + " " + D);
    }
    
}
