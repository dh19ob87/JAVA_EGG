/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10extra2;

import guia10extra2.Servicio.CineServicio;
import guia10extra2.Entidad.Cine;
/**
 *
 * @author diego
 */
public class Guia10Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        Cine cinema = cs.crearCine();
        cs.iniciarJornadaLaboral(cinema);
    }
    
}
