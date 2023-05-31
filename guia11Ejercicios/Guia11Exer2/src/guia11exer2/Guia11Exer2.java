/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11exer2;

import guia11exer2.Entidad.*;
import guia11exer2.Enumerables.Color;
import guia11exer2.Enumerables.LetrasConsumo;
import guia11exer2.Servicio.*;
import java.util.ArrayList;

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
        ArrayList<Electrodomestico> devices = new ArrayList<>();
        devices.add(new Lavadora(31, 1000, Color.ROJO, LetrasConsumo.F, 100));
        devices.add(new Televisor(100, true, 1000, Color.BLANCO, LetrasConsumo.A, 250));
        devices.add(new Lavadora(20, 1000, Color.NEGRO, LetrasConsumo.B, 20));
        devices.add(new Televisor(25, false, 1000, Color.BLANCO, LetrasConsumo.F, 250));
        devices.forEach(electrodomestico -> electrodomestico.toString());
        devices.forEach(System.out::println);
        double precioTotalElectrodomesticos = 0;
        for(Electrodomestico device : devices){
            precioTotalElectrodomesticos += device.getPrecio();
        }
        System.out.println("Precio total de los electrodomésticos en la lista: " + precioTotalElectrodomesticos);
    }

}
