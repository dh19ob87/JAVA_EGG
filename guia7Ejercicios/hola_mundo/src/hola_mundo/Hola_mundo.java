/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_mundo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Hola_mundo {
    /**
     * @param args the command line arguments
     */
    
    public static String nombre;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //System.out.println("Hola mundo");
        Scanner consola = new Scanner(System.in);
   
        int number;
        String cadena, mensaje;
        
        System.out.println("Cadena");
        cadena = consola.nextLine();
        System.out.println("int");
        number = consola.nextInt();
        
        
        if (0 < number && number < 5){
            System.out.format("Cadena %s, entero %d", cadena, number);
        }
        
        mensaje = (number > 10) ? "Número mayor a 10" : "Número menor a 10";
        System.out.println(mensaje);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Por favor ingrese su apellido");
        String apellido = reader.readLine();
        
        saludar(apellido);
    }
    
    public static void saludar (String apellido){
        nombre = "Diego Hernando";
        System.out.println(nombre + " " + apellido);
    }
    
}
