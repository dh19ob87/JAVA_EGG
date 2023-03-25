/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra44;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra44 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int palabras = 0;
        String palabra_sopa_de_letras;
        String [][] crucigrama = new String [20][20];
        
        Arrays.stream(crucigrama).forEach(letra -> Arrays.fill(letra, "" + String.valueOf((int) (Math.random()*10))));
        
        print_vector(crucigrama);
        System.out.println("");
        
        do {
            System.out.println("Por favor ingrese una palabra de mínimo 3 caracteres y máximo 5 caracteres.");
            palabra_sopa_de_letras = CONSOLE.next();
            
            if((palabra_sopa_de_letras.length() >= 3) && (palabra_sopa_de_letras.length() <= 5)){
                palabras ++;
                ubicar_palabra(crucigrama, palabra_sopa_de_letras);
            }
        } while (palabras < 5);
        
        System.out.println("");
        print_vector(crucigrama);
        
    }
    
    private static void ubicar_palabra(String [][] crucigrama, String palabra){
        int fila = (int) (Math.random() * 19);
        
        for (int i = 0; i < palabra.length(); i++) {
            crucigrama[fila][i] = String.valueOf(palabra.charAt(i));
        }
    }
    
    public static void print_vector (String [][] vector){
        for(String[] fila : vector){
            System.out.println(Arrays.toString(fila));
        }
    }
    
}
