/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra32;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra32 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero, digitos;
        digitos = 0;
        System.out.println("Por favor ingrese un número");
        numero = CONSOLE.nextInt();
        
        System.out.printf("%d tiene %d dígitos. \n", numero, ContarDigitos(digitos, numero));
    }
    
    private static int ContarDigitos(int digitos, int numero){
        if(numero == 0 && digitos == 0){
            return 1;
        }else if(numero <= 0){
            return digitos;
        }else{
            digitos ++;
            return ContarDigitos(digitos, (numero/10));
        }
    }
    
}
