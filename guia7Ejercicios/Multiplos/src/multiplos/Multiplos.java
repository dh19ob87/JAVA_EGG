/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int operandoA, operandoB;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Por favor ingrese el primer operando:");
        operandoA = Integer.parseInt(lector.readLine());
        System.out.println("Por favor ingrese el segundo operando:");
        operandoB = Integer.parseInt(lector.readLine());
        validarMultiplo(operandoA, operandoB);
    }
    
    private static void validarMultiplo (int x, int y){
        boolean esMultiplo;
        
        esMultiplo = ((x%y) == 0);
        
        System.out.format("¿%d Es múltiplo de %d? %b \n", x, y, esMultiplo);
    }
    
}
