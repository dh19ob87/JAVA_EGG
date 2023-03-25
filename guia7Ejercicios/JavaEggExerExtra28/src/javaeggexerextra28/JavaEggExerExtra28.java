/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra28;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra28 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n, copiaN, number, max, min, promedio;
        promedio = max = min = number = 0;
        
        System.out.println("Por favor ingrese la cantidad de números a ingresar");
        n = CONSOLE.nextInt();
        copiaN = n;
        
        while (n > 0) {
            System.out.println("Versión while");
            System.out.println("Por favor ingrese un número");
            number = CONSOLE.nextInt();
            max = (number > max) ? number : max;
            if(n == copiaN){
                min = number;
            }else{
                min = (number < min) ? number : min;
            }
            promedio += number;
            n --;
        }
        
        System.out.printf("Promedio = %d | Máximo = %d | Mínimo = %d", (promedio/copiaN), max, min);
        max = min = promedio = 0;
        
        do {
            System.out.println("Version do while");
            System.out.println("Por favor ingrese un número");
            number = CONSOLE.nextInt();
            max = (number > max) ? number : max;
            if(n == 0){
                min = number;
            }else{
                min = (number < min) ? number : min;
            }
            promedio += number;
            n++;
        } while (n < copiaN);
        
        System.out.printf("Promedio = %d | Máximo = %d | Mínimo = %d", (promedio/copiaN), max, min);
    }
    
}
