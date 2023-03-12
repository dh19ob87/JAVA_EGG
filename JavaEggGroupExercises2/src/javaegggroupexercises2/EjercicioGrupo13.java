/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

package javaegggroupexercises2;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EjercicioGrupo13 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de asteriscos a imprimir");
        int asteriscos = input.nextInt();
        
        for (int i = 0; i < asteriscos; i++) {
            for (int j = 0; j < asteriscos; j++) {
                if(i == 0 || i == asteriscos-1){
                    System.out.print("*");
                }else if(j == 0 || j == asteriscos-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
