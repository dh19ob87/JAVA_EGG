/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer1.Servicio;

import guia9ejer1.Entidad.Mascota;
import guia9ejer1.Utilidades.Comparadores;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class MascotaServicio {

    public Mascota crearRazas() {
        return new Mascota();
    }

    public void ingresarRazas(Mascota pet) {
        int salir = 0;
        do {
            System.out.println("Por favor ingrese una raza");
            pet.addRaza(new Scanner(System.in).useDelimiter("\n").next());
            System.out.println("¿Desea salir?");
            salir = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ENGLISH).nextInt();
        } while (salir != 0);
        imprimirRazas(pet);
    }

    public void imprimirRazas(Mascota pet) {
        pet.getRazas().forEach((elemento) -> System.out.println(elemento));
    }

    public void buscarRazaIterador(Mascota pet, String raza) {
        Iterator<String> iter = pet.getRazas().iterator();
        boolean find = false;

        while (iter.hasNext()) {
            if (iter.next().equalsIgnoreCase(raza)) {
                iter.remove();
                find = true;
                System.out.println(raza + " eliminado");
            }else if(!iter.hasNext() && !find){
                System.out.println("Elemento no encontrado.");
            }
        }
    }
    
    public void ordenarComparadorDesc(Mascota pet){
        Collections.sort(pet.getRazas(), Comparadores.ordenarRazasDescendente);
    }
    
    public void ordenarComparadorAsc(Mascota pet){
        Collections.sort(pet.getRazas(), Comparadores.ordenarRazasAscendente);
    }
}
