/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra37;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra37 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String [][] personas;
        int n;
        
        System.out.println("Por favor ingrese la cantidad de personas.");
        n = Integer.parseInt(CONSOLE.readLine());
        personas = new String [n][2];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Por favor ingresa el nombre de la persona %d \n", i+1);
            personas[i][0] = CONSOLE.readLine();
            System.out.printf("Por favor ingresa la edad de la persona %d \n", i+1);
            personas[i][1] = CONSOLE.readLine();
        }
        
        System.out.println("Imprimiendo nombres");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nombre = %s, edad = %s \n", personas[i][0], personas[i][1]);
            System.out.println("¿Deseas seguir imprimiendo datos (Si / No)?");
            if(CONSOLE.readLine().equals("No")){
                break;
            }
        }
    }
    
}
