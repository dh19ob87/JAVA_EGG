/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer18;
//import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class JavaEggExer18 {

    /**
     * @param args the command line arguments
     */
    
//    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int matriz [][] = new int [4][4];
        
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        
        for(int [] row : matriz){
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println("\n Matriz traspuesta \n");
        
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                System.out.printf(" [%d] ", matriz[j][i]);
            }
            System.out.println("");
        }
        
        System.out.println("\n Matriz traspuesta método alternativo ");
        
        String cadena;
        
        for(int i = 0; i <= 3; i++){
            cadena = "[";
            for(int j = 0; j <= 3; j++){
                if(j == 3){
                    cadena += matriz[j][i] + "] ";
                }else{
                    cadena += matriz[j][i] + ", ";
                }
            }
            System.out.printf("%s", cadena);
            System.out.println("");
        }
    }
    
}
