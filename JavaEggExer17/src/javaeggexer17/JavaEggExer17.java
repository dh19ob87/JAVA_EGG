/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author diego
 */
public class JavaEggExer17 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int item, number[], contador = 0;
        
        System.out.println("Por favor ingrese la longitud del array");
        item = Integer.parseInt(CONSOLE.readLine());
        
        number = new int [item];
        
        for(int i = 0; i < item; i++){
            System.out.println("Por favor ingrese un número");
            number[i] = Integer.parseInt(CONSOLE.readLine());
        }
        
        for(int i = 0; i < item; i++){
            System.out.printf("%d -> %d dígitos \n", number[i], cifras(number[i], 0));
        }
    }
    
    private static int cifras (int number, int contador){
        if(number > 0){
            contador ++;
            return cifras((number/10) , contador);
        }else{
            if(number == 0 && contador == 0){
                contador ++;
            }
            return contador;
        }
    }
}
