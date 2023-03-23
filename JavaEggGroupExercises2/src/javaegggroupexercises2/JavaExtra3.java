/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaegggroupexercises2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String caracter;
        
        System.out.println("Por favor ingrese una letra");
        caracter = input.next();
        
        if(caracter.equalsIgnoreCase("a")){
            System.out.println("Es una vocal");
        }else if(caracter.equalsIgnoreCase("e")){
            System.out.println("Es una vocal");
        }else if(caracter.equalsIgnoreCase("i")){
            System.out.println("Es una vocal");
        }else if (caracter.equalsIgnoreCase("o")) {
            System.out.println("Es una vocal");
        }else if (caracter.equalsIgnoreCase("u")) {
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal. O ingresaste una palabra");
        }
        
        System.out.println("-----------");
        
        switch(caracter){
            case "a":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal. O escribiste una palabra");
        }
    } 
}
