/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarnota;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar_nota = false;
        float nota;
        Scanner lector = new Scanner(System.in);
        
        while(!validar_nota){
            System.out.println("Por favor ingrese una nota");
            nota = lector.nextInt();
            validar_nota = (nota >= 0 && nota <= 10) ? true : false;
        }
        
        System.out.println("Nota entre el intervalo correcto");
    }
    
}
