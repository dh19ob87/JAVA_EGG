/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaegggroupexercises2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaExtra2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, c, d, aux;
        
        System.out.println("Por favor ingrese el valor de A");
        a = input.nextInt();
        System.out.println("Por favor ingrese el valor de B");
        b = input.nextInt();
        System.out.println("Por favor ingrese el valor de C");
        c = input.nextInt();
        System.out.println("Por favor ingrese el valor de D");
        d = input.nextInt();
        
        System.out.printf("A = %d, B = %d, C = %d, D = %d \n", a, b, c, d);
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.printf("A = %d, B = %d, C = %d, D = %d \n", a, b, c, d);
    }
}
