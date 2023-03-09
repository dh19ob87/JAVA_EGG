//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagroupexercises;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaGroupExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // TODO code application logic here
        int opcion;
        Scanner leer = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese un numeros entero: ");
            int num1 = leer.nextInt();
            System.out.println("Ingrese un numeros entero: ");
            int num2 = leer.nextInt();
            
            int result = 0;
            double result2 = 0;
            
            
                System.out.println("Elija una opcion: ");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Por favor seleccione una opción");
                
                opcion = leer.nextInt();

                switch (opcion){
                    case 1:
                        result = num1+num2;
                        System.out.println("la suma de "+num1+" y "+num2+" es "+result  );
                        break;
                    case 2:
                        result = num1-num2;
                        System.out.println("la resta de "+num1+" y "+num2+" es "+result);
                        break;
                    case 3:
                        result = num1*num2;
                        System.out.println("la multiplicacion de "+num1+" y "+num2+" es "+result);
                        break;
                    case 4:
                        result2 = num1/num2;
                        System.out.println("la division de "+num1+" y "+num2+" es "+result2);
                        break;
                    case 5:
                        System.out.println("CInco");
                        String letra = leer.next();
                        break;
                    default:
                        System.out.println("No permitido");

                }
            } while (opcion != 5 );
    }
}