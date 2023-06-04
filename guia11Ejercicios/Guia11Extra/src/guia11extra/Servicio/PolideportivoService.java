/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra.Servicio;

import guia11extra.Entidad.Polideportivo;
import java.util.Locale;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class PolideportivoService {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Polideportivo crearPolideportivo(){
        Double ancho, alto, largo;
        String nombre;
        Boolean isTechado;
        System.out.println("""
                           Bienvenido
                           
                           Vamos a registrar un polideportivo por favor ingresa el nombre:
                           """);
        nombre = INPUT.next();
        System.out.println("Por favor ingrese si es techado. true para sí | false para no");
        isTechado = INPUT.nextBoolean();
        System.out.println("Por favor ingrese el ancho");
        ancho = INPUT.nextDouble();
        System.out.println("Por favor ingrese el alto");
        alto = INPUT.nextDouble();
        System.out.println("Por favor ingrese el largo");
        largo = INPUT.nextDouble();
        return new Polideportivo(nombre, isTechado, ancho, alto, largo);
    }
    
    public void printData(Polideportivo park){
        System.out.println(park.toString());
    }
    
    public void cantidad(LinkedList<Polideportivo> parks){
        System.out.printf("Polideportivos techados: " + parks.stream().filter(parque -> parque.getIsTechado()).count());
        System.out.printf("Polideportivos no techados: " + parks.stream().filter(parque -> !parque.getIsTechado()).count());
    }
}
