/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer16;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer16 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int n, val, contador_repeticion, vector[];
        contador_repeticion = 0;
        
        System.out.println("Por favor ingrese la longitud del array");
        n = Integer.parseInt(CONSOLE.readLine());
        
        vector = new int [n];
        
        for(int i = 0; i < n; i++){
            vector[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Por favor ingrese el número que desea buscar en el Array");
        val = Integer.parseInt(CONSOLE.readLine());
        
        for(int i = 0; i < n; i ++){
            if (vector[i] == val){
                contador_repeticion ++;
                System.out.printf("Repetido = %b, Posicion (es): %d \n", (contador_repeticion > 1), i);
            }
        }
        
        if (contador_repeticion == 0){
            System.out.println("El valor solicitado no se encuentra en el vector.");
        }
    }
    
}
