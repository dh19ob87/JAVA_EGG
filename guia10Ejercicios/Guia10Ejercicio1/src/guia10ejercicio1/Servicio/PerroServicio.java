/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10ejercicio1.Servicio;

import guia10ejercicio1.Entidad.Perro;
import guia10ejercicio1.Enumerable.RazasCanes;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PerroServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Perro crearMascota(){
        String raza;
        do {
            System.out.println("Por favor ingrese la raza del perro");
            for(RazasCanes elemento : RazasCanes.values()){
                System.out.println(elemento);
            }
            raza = INPUT.next();
        } while (!getRaza(raza));
        
        System.out.println("Por favor ingrese el nombre, edad y tamaño del perro");
        return new Perro(INPUT.next(), RazasCanes.valueOf(raza.toUpperCase()), INPUT.nextInt(), INPUT.nextDouble());
    }
    
    public boolean getRaza(String raza){
        boolean find = false;
        for(RazasCanes elemento : RazasCanes.values()){
            if(elemento.toString().equalsIgnoreCase(raza)){
                find = true;
                break;
            }
        }
        return find;
    }
}
