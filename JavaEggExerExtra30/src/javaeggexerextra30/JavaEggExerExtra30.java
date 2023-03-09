/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra30;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra30 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner CONSOLE = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador, denominador;
        
        numerador = CONSOLE.nextInt();
        denominador = CONSOLE.nextInt();
        
        System.out.printf("%d / %d = %d", numerador, denominador, divisionPorRestas(numerador, denominador));
        
    }
    
    private static int divisionPorRestas (int numerador, int denominador){
        int resto = numerador - denominador;
        if(resto > denominador){
            resto = numerador - denominador;
            numerador = resto;
            return divisionPorRestas(numerador , denominador);
        }
        else{
            return resto;
        }
    }
    
}
