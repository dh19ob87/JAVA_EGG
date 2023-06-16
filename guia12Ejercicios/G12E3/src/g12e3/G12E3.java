/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12e3;

import g12e3.Servicio.DivisionNumeroServicio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class G12E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DivisionNumeroServicio ds = new DivisionNumeroServicio();
            ds.dividir();
        } catch (Exception ex) {
            Logger.getLogger(G12E3.class.getName()).log(Level.SEVERE, "opción no válida", ex);
        }
        System.out.println("Sigo con la ejecución del programa");
    }
    
}
