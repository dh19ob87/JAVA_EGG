/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11exer2;

import guia11exer2.Entidad.*;
import guia11exer2.Servicio.*;
/**
 *
 * @author diego
 */
public class Guia11Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LavadoraServicio washerService = new LavadoraServicio();
        TelevisorServicio tvService = new TelevisorServicio();
        washerService.imprimirData(washerService.crearLavadora());
        tvService.imprimirDatos(tvService.crearTelevisor());
    }
    
}
