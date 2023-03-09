/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra31;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra31 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numeroUsuario, numeroSistema, diferencia;
        numeroSistema = (int) (Math.random() * 10);
        System.out.println(numeroSistema);
        
        do {
            System.out.println("¡Adivina el número!");
            System.out.println("Por favor ingrese un número entre 0 y 10");
            
            numeroUsuario = Integer.parseInt(CONSOLE.readLine());
            
            diferencia = numeroSistema - numeroUsuario;
            diferencia = (diferencia < 0) ? (diferencia * -1) : diferencia;
            
            if(diferencia != 0){
                if(diferencia > 7){
                    System.out.println("FRIO");
                }else if(diferencia < 7 && diferencia > 4){
                    System.out.println("TIBIO");
                }else if(diferencia < 4 && diferencia >= 1){
                    System.out.println("CALIENTE");
                }
            }
        } while (numeroSistema != numeroUsuario);
        
        System.out.println("Juego terminado adivinaste el número secreto " + numeroUsuario);
    }
    
}
