/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimir_veinte_numeros;
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class Imprimir_veinte_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int contador, numero, sumatoria;
        contador = sumatoria = 0;
        
        do{
            contador ++;
            System.out.println("Ingresa un número");
            numero = lector.nextInt();
            
            if (numero == 0){
                break;
            }
            
            if (contador < 0){
                continue;
            }else{
                sumatoria = sumatoria + numero;
            }
        }while (contador < 20);
                    
        System.out.println("Sumatoria = " + sumatoria);
        
    }
    
}
