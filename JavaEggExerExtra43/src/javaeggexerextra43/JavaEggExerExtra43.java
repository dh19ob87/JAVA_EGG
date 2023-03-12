/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra43;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra43 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrix;
        int n, m, sumatoria;
        sumatoria = 0;
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz");
        n = CONSOLE.nextInt();
        System.out.println("Por favor ingrese la cantidad de columnas de la matriz");
        m = CONSOLE.nextInt();
        
        matrix = new int[n][m];
        
        Arrays.stream(matrix).forEach(a -> Arrays.fill(a, 0));
        
        for(int [] fila : matrix){
            System.out.println(Arrays.toString(fila));
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix [i][j] = (int) (Math.random() * 100);
                sumatoria += matrix[i][j];
            }
        }
        System.out.println("");
        
        for(int [] fila : matrix){
            System.out.println(Arrays.toString(fila));
        }
        
        System.out.println("");
        
        System.out.println("Sumatoria = " + sumatoria);
    }
    
}
