/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer1;

import guia9ejer1.Entidad.Mascota;
import guia9ejer1.Servicio.MascotaServicio;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Guia9ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MascotaServicio ms = new MascotaServicio();
        Mascota pet = ms.crearRazas();
        ms.ingresarRazas(pet);
        pet.ordenarRazas();
        System.out.println("--------------------");
        ms.imprimirRazas(pet);
        System.out.println("--------Reverse------");
        pet.ordenarReverseRazas();
        ms.imprimirRazas(pet);
        System.out.println("--------------------");
        System.out.println("Por favor ingrese una raza a eliminar");
        ms.buscarRazaIterador(pet, new Scanner(System.in).useDelimiter("\n").next());
        System.out.println("--------------------");
        ms.imprimirRazas(pet);
        System.out.println("-----------Shuffle-------------");
        Collections.shuffle(pet.getRazas());
        ms.imprimirRazas(pet);
        System.out.println("-----------Ordenando Comparators Desc-----------");
        ms.ordenarComparadorDesc(pet);
        ms.imprimirRazas(pet);      
        System.out.println("-----------Shuffle-------------");
        Collections.shuffle(pet.getRazas());
        ms.imprimirRazas(pet);
        System.out.println("-----------Ordenando Comparators Asc-----------");
        ms.ordenarComparadorAsc(pet);
        ms.imprimirRazas(pet);        
    }

}
