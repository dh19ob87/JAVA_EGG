/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra29;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra29 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int number, contadorNumeros, contadorPares, contadorImpares;
        contadorNumeros = contadorPares = contadorImpares = 0;
        
        do {
            number = Integer.parseInt(CONSOLE.readLine());
            if(number > 0){
                contadorNumeros ++;
                int pivote = (number % 2 == 0) ? contadorPares++ : contadorImpares++;
            }
        } while ((number % 5) != 0);
        
        System.out.printf("Total números ingresados: %d, pares: %d, impares: %d", contadorNumeros, contadorPares, contadorImpares);
    }
    
}
