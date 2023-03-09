/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra34;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra34 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un número");
        secuencia(CONSOLE.nextInt());
    }
    
    public static void secuencia(int n){
        if(n<=0){
            System.out.println("Debe poner un número mayor a 0");
        }else if(n == 1){
            System.out.println(n);
        }else{
            secuencia(n-1);
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
