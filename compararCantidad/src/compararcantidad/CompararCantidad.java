/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararcantidad;
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class CompararCantidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA, numB;
        boolean comparar;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Por favor ingresa el primer operando");
        numA = console.nextInt();
        System.out.println("Por favor ingresa el segundo operando");
        numB = console.nextInt();
        comparar = (numA == numB) ? true : false;
        System.out.format("¿Son iguales? %s \n", comparar);
    }
    
}
