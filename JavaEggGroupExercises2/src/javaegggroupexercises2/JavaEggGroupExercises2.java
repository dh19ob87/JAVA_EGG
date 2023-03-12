//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

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
public class JavaEggGroupExercises2 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        Scanner consola = new Scanner(System.in);
//        int limite_superior, numero_ingresado, sumatoria;
//        sumatoria = 0;
//        
//        System.out.println("Por favor ingrese el límete superior de la sumatoria");
//        limite_superior = consola.nextInt();
//        
//        do {
//            System.out.println("Por favor ingrese un número entero positivo");
//            numero_ingresado = consola.nextInt();
//            sumatoria += numero_ingresado;
//        } while (sumatoria < limite_superior);
//        
//        System.out.println("Limite superado ");
//        System.out.printf("Limite superior: %d, Sumatoria = %d \n", limite_superior, sumatoria);
//    }
    
    
// Author: Carolina Molina Egg    
//    public static void main(String[] args) {
//        int lim,suma,num;
//        
//        suma = 0;
//        
//        Scanner leer = new Scanner(System.in);
//        
//        System.out.println("Ingrese un límite positivo:");
//        lim = leer.nextInt();
//        
//        do {
//            
//        System.out.println("Ingrese un número:");
//        num = leer.nextInt();
//        suma = suma + num;
//        
//        } while (suma <= lim);
//        
//        System.out.println("Se superó el límite positivo");
//    }
    
    public static void main(String[] args) {
        int lim,suma,num;
        
        suma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un límite positivo:");
        lim = leer.nextInt();
        
        for (int i = 0; i <= lim; i++) {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            suma += num;
            if(suma > lim){
                break;
            }
        }
        
        System.out.println("Se superó el límite positivo");
    }
}
