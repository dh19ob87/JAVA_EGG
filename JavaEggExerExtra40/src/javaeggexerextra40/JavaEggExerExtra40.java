/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra40;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diego
 */

public class JavaEggExerExtra40 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] vectorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] vectorB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("Los vectores A y B, %s son iguales \n", (comparar_arrays(vectorA, vectorB)) ? "SÍ" : "NO");
    }
    
    private static boolean comparar_arrays(int [] vectorA, int [] vectorB) {
        if(vectorA.length != vectorB.length){
            System.out.println("Los vectores no son iguales");
        }else{
            for (int i = 0; i < vectorA.length; i++) {
                if(vectorA[i] != vectorB[i]){
                    return false;
                }
            }
        }
        return true;
    }
    
}
