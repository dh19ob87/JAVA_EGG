/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12e3;

import g12e3.Servicio.DivisionNumeroServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class G12E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        Logger logger = Logger.getLogger(G12E3.class.getName());
        FileHandler handler = new FileHandler(G12E3.class.getName() + "_log.txt");
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        try {
            // TODO code application logic here
            logger.log(Level.INFO, "Inicio de programa");
            DivisionNumeroServicio ds = new DivisionNumeroServicio();
            logger.log(Level.INFO, "Creaci\u00f3n instancia Division servicio {0}", ds.toString());
            ds.dividir();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Falló llamado a la función", ex);
        }
        System.out.println("Sigo con la ejecución del programa");
    }
    
}
