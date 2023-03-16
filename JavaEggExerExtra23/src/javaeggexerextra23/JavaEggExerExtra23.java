/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra23;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra23 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        int minutos;
        
        minutos = Integer.parseInt(CONSOLE.readLine());
        
        System.out.printf("%d Minutos -> %d horas -> %f días \n", minutos, (minutos / 60), (float) (minutos/60)/24);
    }
}
