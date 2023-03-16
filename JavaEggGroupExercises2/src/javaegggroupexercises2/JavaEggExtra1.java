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
public class JavaEggExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //1140 minutos = 1 dia
       //60 minutos = 1 hora
        double totMins;
        double horas;
        double dias;
 
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos: ");
            totMins= leer.nextInt();
            horas= (totMins/60);
            dias= (horas/24);

            System.out.printf("%d dia(s) %f horas",(int) dias ,horas); 

        }
    }
