/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer11 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
       while(calculadora(imprimirMenu()) != 5){}
        
    }
    
    private static int imprimirMenu () throws IOException{
        System.out.println("MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Elija opción");
        return Integer.parseInt(CONSOLE.readLine());
    }
    
    private static int calculadora(int operacion) throws IOException{
        
        int operandoA, operandoB, salir;
        
        salir = operandoA = operandoB = 0;
        
        if(operacion != 5){
            System.out.println("Ingrese el valor del primer operando");
            operandoA = Integer.parseInt(CONSOLE.readLine());
            System.out.println("Ingrese el valor del segundo operando");
            operandoB = Integer.parseInt(CONSOLE.readLine());        
        }
        
        switch (operacion) {
            
            case 1:
                System.out.printf("%d + %d = %d \n", operandoA, operandoB, operandoA+operandoB);
                break;
            case 2:
                System.out.printf("%d - %d = %d \n", operandoA, operandoB, operandoA-operandoB);
                break;
            case 3:
                System.out.printf("%d * %d = %d \n", operandoA, operandoB, operandoA*operandoB);
                break;
            case 4:
                if(operandoB == 0){
                    System.out.println("No es posible realizar esta operación");
                }else{
                    System.out.printf("%d + %d = %d \n", operandoA, operandoB, operandoA/operandoB);
                }
                break;
            case 5:
                System.out.println("¿De verdad desea salir (S/N)?");
                salir = CONSOLE.readLine().compareTo("S") == 0 ? 5 : 0;
                break;
            default:
                System.out.println("Opción no permitida.");
                throw new AssertionError();
        }
        
         return salir;
    }
    
}
