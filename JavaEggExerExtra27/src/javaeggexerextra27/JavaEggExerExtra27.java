/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra27;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra27 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float [] estaturas;
        int n;
        float promedio;
        
        promedio = 0;
        
        System.out.println("Por favor ingrese la cantidad de personas");
        n = Integer.parseInt(CONSOLE.readLine());
        
        estaturas = new float [n];
        
        for (int i = 0; i < n; i++) {
            estaturas[i] = Float.parseFloat(CONSOLE.readLine());
        }
        
        for(float item : estaturas){
            if(item < 1.60){
                promedio ++;
            }
        }
        
        System.out.println("Promedio de personas con una altura menor a 1.60 mts es: " + (promedio / n));
    }   
}
