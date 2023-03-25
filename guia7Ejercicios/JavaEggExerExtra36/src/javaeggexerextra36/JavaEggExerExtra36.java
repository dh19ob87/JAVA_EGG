/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra36;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra36 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b, opcion;
        a = b = 0;
        do {
            System.out.println("Bienvenido");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Por favor ingrese una opción: ");
            opcion = CONSOLE.nextInt();
            if(opcion != 5){
                System.out.println("Ingrese el primer operando");
                a = CONSOLE.nextInt();
                System.out.println("Ingrese el segundo operando ");
                b = CONSOLE.nextInt();
            }
            
            switch(opcion){
                case 1:
                    System.out.println(sumar(a, b));
                    break;
                case 2:
                    System.out.println(restar(a, b));
                    break;
                case 3:
                    System.out.println(multiplicar(a, b));
                    break;
                case 4:
                    System.out.println(dividir(a, b));
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no permitida.");
            }
        } while (opcion != 5);
    }
    
    private static int sumar(int a, int b){
        return a+b;
    }
    
    private static int restar(int a, int b){
        return a-b;
    }
    
    private static int multiplicar(int a, int b){
        return a*b;
    }
    
    private static int dividir(int a, int b){
        if(b == 0){
            return 0;
        }else{
            return a/b;
        }
    }
    
}
