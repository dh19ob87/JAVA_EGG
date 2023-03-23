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
public class JavaExtra1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double minutos;
        int dias, horas;
        
        System.out.println("Por favor ingrese los minutos");
        minutos = input.nextDouble();
        dias = (int) (minutos/1440);
        horas = (int) ((minutos%1440)/60);
        System.out.println("Días " + dias + " horas " + horas);
    }
}
