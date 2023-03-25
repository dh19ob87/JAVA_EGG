/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra25;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra25 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int number;
        
        System.out.println("Por favor ingrese un número entre 1 y 10");
        number = Integer.parseInt(CONSOLE.readLine());
        if(number <= 0 || number > 10){
            System.out.println("Vuelva a intentarlo [1 - 10]");
        }else{
            System.out.printf("%s \n", (number == 1) ? "I" : (number == 2) ? "II" : (number == 3) ? "III" : (number == 4) ? "IV" : (number == 5) ? "V" : (number == 6) ? "VI" : (number == 7) ? "VII" : (number == 8) ?  "VIII" : (number == 9) ? "IX" : (number == 10) ? "X" : "NaN");
        }
    }
    
}
