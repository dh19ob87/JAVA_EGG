/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer21;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExer21 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matrizGeneral, matrizEspecifica;
        int n, m;
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz más grande");
        n = CONSOLE.nextInt();
        
        matrizGeneral = new int [n][n];
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz más pequeña");
        m = CONSOLE.nextInt();
        
        matrizEspecifica = new int [m][m];
        
        Arrays.stream(matrizGeneral).forEach(a -> Arrays.fill(a, 0));
        Arrays.stream(matrizEspecifica).forEach(a -> Arrays.fill(a, 0));
        
        
    }
    
}
