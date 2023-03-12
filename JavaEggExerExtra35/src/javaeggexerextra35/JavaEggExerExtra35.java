/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra35;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra35 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        int total_familias, total_hijos, promedio_edad_hijos, hijos;
        total_familias = hijos = total_hijos = promedio_edad_hijos = 0;
        
        System.out.println("Por favor ingrese la cantidad de familias a estudiar");
        total_familias = Integer.parseInt(CONSOLE.readLine());
        
        for (int i = 0; i < total_familias; i++) {
            System.out.printf("¿Cuántos hijos tiene la familia %d \n", i+1);
            hijos = Integer.parseInt(CONSOLE.readLine());
            total_hijos += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.printf("¿Qué edad tiene el hijo %d de la familia %d?", j+1, i+1);
                promedio_edad_hijos += Integer.parseInt(CONSOLE.readLine());
            }
        }
        
        System.out.println("La media de edad de todas las familias es: " + promedio_edad_hijos/total_hijos);
    }
    
}
