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
        int [] valoresA ={1, 26, 36, 47, 5, 6, 72, 81, 95, 10, 11, 12, 13, 21, 41, 22, 67, 20, 10, 61, 56, 78, 87,90, 9, 90, 17, 12, 87, 67, 41, 87, 24, 56, 97, 74, 87, 42, 64, 35, 32, 76, 79, 1, 36, 5, 67, 96, 12, 11, 99, 13, 54, 88, 89, 90, 75, 12, 41 ,76, 67, 78, 87, 45, 14, 22, 26, 42, 56, 78, 98, 45, 34, 23, 32, 56, 74, 16, 19, 18, 24, 67, 97, 46, 87, 13, 67, 89, 93, 24, 21, 68, 78, 98, 90, 67, 12, 41, 65, 12};
//        int [] valoresB = {36, 5, 67, 89, 90, 75, 14, 22, 26};
        int [] valoresB = {16, 19, 18, 89, 93, 24, 41, 65, 12};
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz más grande");
        n = CONSOLE.nextInt();
        
        matrizGeneral = new int [n][n];
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz más pequeña");
        m = CONSOLE.nextInt();
        
        matrizEspecifica = new int [m][m];
        
        Arrays.stream(matrizGeneral).forEach(a -> Arrays.fill(a, 0));
        Arrays.stream(matrizEspecifica).forEach(a -> Arrays.fill(a, 0));
        imprimir_matriz_cuadrada(matrizGeneral, n);
        System.out.println("");
        imprimir_matriz_cuadrada(matrizEspecifica, m);
        push_matriz(matrizGeneral, n, valoresA);
        push_matriz(matrizEspecifica, m, valoresB);
        System.out.println("");
        imprimir_matriz_cuadrada(matrizGeneral, n);
        System.out.println("\n");
        imprimir_matriz_cuadrada(matrizEspecifica, m);
        recorrer(matrizGeneral, matrizEspecifica, n, m);
    }
    
    private static void recorrer (int [][] matrizG, int[][] matrizE, int n, int m){
        
        boolean confirmado = false;
        
        for (int i = 0; i < n-(m-1); i++) {
            for (int j = 0; j < n-(m-1); j++) {
                System.out.println("Recorrer " + i + ", " + j);
                if(comparar(matrizG, matrizE, i, j, m)){
                    confirmado = true;
                    System.out.printf("Posición inicial [%d, %d]", i, j);
                    break;
                }
            }
            if (confirmado){
                    break;
            }
        }
    }
    
    private static boolean comparar (int [][] matrizG, int [][] matrizE, int posA, int posB, int m){
        boolean matrizEncontrada = true;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("G " + matrizG[posA+i][posB+j] + " E " + matrizE[i][j]);
                if(matrizG[posA+i][posB+j] != matrizE[i][j]){
                    matrizEncontrada = false;
                    break;
                }
            }
            if(!matrizEncontrada){
                break;
            }
        }
        
        return matrizEncontrada;
    }
    
    private static void imprimir_matriz_cuadrada (int[][] matriz, int longitud){
        for(int[] row : matriz){
            System.out.println(Arrays.toString(row));
        }
    }
    
    private static void push_matriz (int [][] matriz, int longitud, int [] valores){
        
        int contador = 0;
        
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                matriz[i][j] = valores[contador];
                contador ++;
            }
        }
    }
}
