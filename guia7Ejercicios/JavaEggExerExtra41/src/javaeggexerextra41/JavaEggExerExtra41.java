/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra41;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra41 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] vector;
        int n;
        
        System.out.println("Por favor ingrese la longitud del array");
        n = CONSOLE.nextInt();
        vector = new int [n];
        push_random_vector(vector);
        print_vector(vector);        
    }
    
    private static void push_random_vector (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }
    
    private static void print_vector (int [] vector){
        for(int elemento : vector){
            System.out.println(elemento);
        }
        
        System.out.println(Arrays.toString(vector));
    }
}
