/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra38;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra38 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int divisores = 1;
        System.out.println("Ingrese un número");
        int n = CONSOLE.nextInt();
        System.out.println(es_primo(n));
    }
    
    private static boolean es_primo (int n){
        int divisores = 0;
        
        for (int i = 1; i <= n; i++) {
            if(divisores > 2){
                break;
            }else if (n%i == 0) {
                    divisores++;
            }
        }
        return (divisores==2);
    }
    
}
