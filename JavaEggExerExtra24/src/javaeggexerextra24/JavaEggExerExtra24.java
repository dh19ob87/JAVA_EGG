/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra24;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra24 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String vocal;
        
        System.out.println("Por favor ingrese una vocal.");
        vocal = CONSOLE.nextLine();
        if(vocal.length() > 1 || vocal.length() == 0){
            System.out.println("Sí ve por qué es que no se puede confiar en el usuario. Dije una vocal.");
        }
        if(vocal.startsWith("a") || vocal.startsWith("e") || vocal.startsWith("i") || vocal.startsWith("o") || vocal.startsWith("u")){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
}
