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
public class EjercicioGrupo14 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float euros;
        String divisa_a_convertir;
        System.out.println("Ingrese la cantidad de euros");
        euros = input.nextFloat();
        System.out.println("¿A qué divisa quiere convertir? \n [dolares, yenes, libras]");
        divisa_a_convertir = input.next();
        convertirMoneda(euros, divisa_a_convertir);
    }
    
    private static void convertirMoneda(float euros, String moneda_convertir){
        
        switch(moneda_convertir){
            case "dolares":
                System.out.println(euros + " euros equivale a = " + (euros * 1.28611) + " " + moneda_convertir);
                break;
            case "yenes":
                System.out.println(euros + " euros equivale a = " + (euros * 129.852) + " " + moneda_convertir);
                break;
            case "libras":
                System.out.println(euros + " euros equivale a = " + (euros * 0.86) + " " + moneda_convertir);
                break;
            default:
                System.out.println("Opción no permitida");
        }
    }
}
