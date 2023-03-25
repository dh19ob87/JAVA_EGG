/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer13;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer13 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLA = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int asteriscos;
        
        asteriscos = Integer.parseInt(CONSOLA.readLine());
        
        for(int i = 0; i < asteriscos; i ++){
            for(int j = 0; j < asteriscos; j++){
                if (i == 0 || i == asteriscos-1){
                    System.out.print("*");
                }else{
                    if(j == 0 || j == asteriscos - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                
                if (j == asteriscos - 1){
                        System.out.println("");
                }
            }
        }
    }
}
