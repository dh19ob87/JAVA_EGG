/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificarcadena;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class CodificarCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
        
        String mensaje;
        
        System.out.println("Por favor ingrese una frase terminada en punto -> .");
        do {
            mensaje = lector.readLine();
            if (mensaje.charAt(mensaje.length()-1) != '.'){
                System.out.println("Por favor termine la frase en punto -> .");
            }
        } while (mensaje.charAt(mensaje.length()-1) != '.');
        
        codificar_mensaje(mensaje);
    }
    
    public static void codificar_mensaje(String mensaje){
        
        char cadena [] = mensaje.toCharArray();
        mensaje = "";
        
        for(char item : cadena){
            item = (Character.toLowerCase(item) == 'a') ? '@' : (Character.toLowerCase(item) == 'e') ? '#' : (Character.toLowerCase(item) == 'i') ? '$' : (Character.toLowerCase(item) == 'o') ? '%' : (Character.toLowerCase(item) == 'u') ? '*' : item ;
            System.out.println(" " + item);
            mensaje += item;   
        }
        
        System.out.println(new String(cadena));
        System.out.println(mensaje);
    }
    
}
