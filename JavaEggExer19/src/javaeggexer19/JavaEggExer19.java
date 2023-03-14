/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class JavaEggExer19 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int filas, matriz [][];
        boolean antisimétrica = true;
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz cuadrada");
        filas = Integer.parseInt(CONSOLE.readLine());
        
        matriz = new int [filas][filas];
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < filas; j++){
                System.out.printf("Pos[%d, %d] = ", i, j);
                matriz[i][j] = Integer.parseInt(CONSOLE.readLine());
            }
        }
        
//        Ciclos de comprobación matriz antisimétrica
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < filas; j++){
                if(i == j){
                    if(matriz[i][j] != 0){
                        antisimétrica = false;
                        break;
                    }
                }else{
                    if(j <= (i - 1) && i != 0){
                        System.out.printf("%d | %d \n", matriz[j][i], matriz[i][j]);
                        if(matriz[i][j] + matriz[j][i] != 0){
                            antisimétrica = false;
                            break;
                        }
                    }
//                    if(i != 0){
//                        System.out.printf("%d | %d \n", matriz[j][i], matriz[i][j]);
//                        if(j <= (i-1)){
////                            System.out.printf("%d | %d \n", matriz[j][i], matriz[i][j]);
//                            if(matriz[j][i] - matriz[i][j] != 0){
//    //                            System.out.printf("%d - %d", matriz[j][i], matriz[i][j]);
//                                antisimétrica = false;
//                                break;
//                            }
//                        }
//                    }
//                }
            }
            if(!antisimétrica){
                break;
            }
            }
        }
        
        for(int [] row : matriz){
            System.out.println(Arrays.toString(row));
        }
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < filas; j++){
                System.out.printf(" [%d] ", matriz[j][i]);
            }
            System.out.println("");
        }
        
        if(!antisimétrica){
            System.out.println("No es una matriz antisimétrica.");
        }else{
            System.out.println("Es una matriz antisimétrica");
        }
    }  
}
