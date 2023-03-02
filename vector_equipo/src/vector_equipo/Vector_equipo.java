/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_equipo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author diego
 */
public class Vector_equipo {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        String names_team [];
        int n;
        
        System.out.println("Ingrese la cantidad de integrantes del equipo");
        n = Integer.parseInt(CONSOLE.readLine());
        names_team = new String[n];
        ingresarNombres(names_team);
        imprimir_lista_nombres(names_team);
        
    }
    
    private static void ingresarNombres (String [] list) throws IOException{
        for(int i = 0; i < list.length; i++){
            list[i] = CONSOLE.readLine();
        }
    }
    
    private static void imprimir_lista_nombres (String [] list){
        for(String item : list){
            System.out.println(item);
        }
    }
    
}
