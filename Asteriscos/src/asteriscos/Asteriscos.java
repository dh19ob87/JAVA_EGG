/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriscos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diego
 */
public class Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int numbers[] = new int[4];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("For clásico");
        
        for(int i = 0; i<=3; i++){
            numbers[i] = Integer.parseInt(lector.readLine());
        }
        
        for(int i = 0; i<=3; i++){
            System.out.format("item [%s] = %d -> %s \n", i, numbers[i], cadenaAsteriscos(numbers[i]));
        }
        
        System.out.println("For each clásico sobre array");
        
        for (int item : numbers){
            System.out.format("%d -> %s \n", item, cadenaAsteriscos(item));
        }
        
        System.out.println("ArrayList1");
        
        list.add(Integer.parseInt(lector.readLine()));
        list.add(Integer.parseInt(lector.readLine()));
        list.add(Integer.parseInt(lector.readLine()));
        list.add(Integer.parseInt(lector.readLine()));
        
        System.out.println("For each clásico sobre un ArrayList");
        
        for(int item : list){
            System.out.format("%d -> %s \n", item, cadenaAsteriscos(item));
        }
        
        System.out.println("For each alternativo para List stream");
        
        list.forEach((item) -> {
            System.out.format("%d -> %s \n", item, cadenaAsteriscos(item));
        });
        
    }
    
    public static String cadenaAsteriscos(int cantidad){
        String cadena = "";
        
        for(int i = 0; i< cantidad; i++){
            cadena += "*";
        }
        
        return cadena;
    }
    
}
