/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra39;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra39 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float [] numeros;
        int cantidad_elementos;
        
        System.out.println("Por favor ingrese la cantidad de elementos a sumar");
        cantidad_elementos = Integer.parseInt(CONSOLE.readLine());
        
        numeros = new float [cantidad_elementos];
        push_operandos(numeros);
        System.out.println(sumatoria(numeros, 0, 0));
    }
    
    private static void push_operandos (float [] vector) throws IOException{
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Por favor ingrese un número");
            vector[i] = Float.parseFloat(CONSOLE.readLine());
        }
    }
    
    private static float sumatoria(float [] vector, int n, float sumatoria_total){
        if(n == vector.length - 1){
            sumatoria_total += vector[n];
            return sumatoria_total;
        }else{
            sumatoria_total += vector[n];
            n++;
            return sumatoria(vector, n, sumatoria_total);
        }
    }
    
}
