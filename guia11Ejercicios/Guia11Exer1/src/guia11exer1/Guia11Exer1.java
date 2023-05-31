/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11exer1;

import guia11exer1.Servicio.*;
import guia11exer1.Entidad.*;
/**
 *
 * @author diego
 */
public class Guia11Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaballoServicio horseService = new CaballoServicio();
        GatoServicio catService = new GatoServicio();
        PerroServicio dogService = new PerroServicio();
        
        horseService.sonar(horseService.crearCaballo());
        catService.sonar(catService.crearGato());
        dogService.sonar(dogService.crearPerro());
    }
    
}
