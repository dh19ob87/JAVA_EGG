/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer15;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExer15 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE  = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vector[] = new int [100];
        
        for(int i = 0; i < 100; i++){
            vector[i] = i;
        }
        
        for(int i = 99; i >= 0; i--){
            System.out.printf("%d | ", vector[i]);
        }
    }
    
}
