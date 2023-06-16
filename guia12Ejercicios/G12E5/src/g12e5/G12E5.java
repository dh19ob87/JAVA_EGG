/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12e5;

import g12e5.Excepciones.Mayor;
import g12e5.Excepciones.Menor;
import g12e5.Excepciones.Ganaste;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author diego
 */
public class G12E5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        int numeroAleatorio = new Random().nextInt(10);
        int numeroUsuario = 0;
        
        System.out.println(numeroAleatorio);
        System.out.println("Adivina el número");
        
        do {
            try {
                System.out.println("ingresa un número");
                numeroUsuario =  new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US).nextInt();
                throw (numeroUsuario < numeroAleatorio) ? new Menor("Tú número es menor") : (numeroUsuario > numeroAleatorio) ? new Mayor("Tú número es mayor") : new Ganaste("Adivinaste");
                
            } catch (InputMismatchException | NullPointerException | NumberFormatException e) {
                numeroUsuario = numeroAleatorio + 1;
                Logger.getLogger(G12E5.class.getName()).log(Level.SEVERE, "Error de tipo de dato", e);
            }catch(Menor | Mayor | Ganaste e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                Logger.getLogger(G12E5.class.getName()).log(Level.SEVERE, "Excepción", e);
            }

        } while (numeroAleatorio != numeroUsuario);
    }
}
