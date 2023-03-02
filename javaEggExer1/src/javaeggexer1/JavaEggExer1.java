/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        
        x = Integer.parseInt(console.readLine());
        y = Integer.parseInt(console.readLine());
        
        System.out.printf("%d + %d = %d \n", x, y, x+y);
    }
    
}
