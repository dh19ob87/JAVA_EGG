/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12e5;

import g12e5.Excepciones.Mayor;
import g12e5.Excepciones.Menor;
import g12e5.Excepciones.Ganaste;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author diego
 */
public class G12E5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws Exception, IOException, SecurityException{
        // TODO code application logic here
        Logger logger = Logger.getLogger(G12E5.class.getName());
        FileHandler handler = new FileHandler("testLog.txt");
        handler.setFormatter(new SimpleFormatter());
        
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        
        int numeroAleatorio = new Random().nextInt(10);
        logger.log(Level.INFO, "Random creado {0}", numeroAleatorio);
        int numeroUsuario = 0;
        
        System.out.println(numeroAleatorio);
        System.out.println("Adivina el número");
        
        do {
            try {
                System.out.println("ingresa un número");
                numeroUsuario =  new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US).nextInt();
                logger.log(Level.INFO, "N\u00famero ingresado usuario: {0}", numeroUsuario);
                throw (numeroUsuario < numeroAleatorio) ? new Menor("Tú número es menor") : (numeroUsuario > numeroAleatorio) ? new Mayor("Tú número es mayor") : new Ganaste("Adivinaste");
                
            } catch (InputMismatchException | NullPointerException | NumberFormatException e) {
                numeroUsuario = numeroAleatorio + 1;
                logger.log(Level.SEVERE, "Error de tipo de ingreso de dato: ", e);
//                Logger.getLogger(G12E5.class.getName()).log(Level.SEVERE, "Error de tipo de dato", e);
            }catch(Menor | Mayor | Ganaste e){
                System.out.println(e.getMessage());
                logger.log(Level.INFO, "Evento número ingresado " + numeroUsuario, e);
            }catch(Exception e){
                logger.log(Level.SEVERE, "Excepción no contemplada", e);
            }

        } while (numeroAleatorio != numeroUsuario);
    }
}
