/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra.Servicio;

import guia11extra.Entidad.Oficina;
import java.util.Locale;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class OficinaService {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Oficina crearOficina() {
        System.out.println("Por favor ingrese el piso en el que se encontrará la oficina y la cantidad de personas que va a contener la oficina");
        return new Oficina(INPUT.nextInt(), INPUT.nextInt());
    }

    public LinkedList<Oficina> crearOficinas(int pisos, int maximoPersonasEdificio) {
        LinkedList<Oficina> listaDeOficinas = new LinkedList<>();
        int personasEnPiso = 0;
        System.out.println("¡Recuerde que el máximo de personas en todo el edificio es: !" + maximoPersonasEdificio);
        for (int i = 0; i < pisos; i++) {
            maximoPersonasEdificio -= personasEnPiso;
            if (maximoPersonasEdificio <= 0) {
                System.out.println("Ya no hay más cupos disponibles.");
                break;
            } else {
                System.out.println("Cupos disponibles " + maximoPersonasEdificio);
                do {
                    System.out.println("Por favor ingrese la máxima cantidad permitida de personas en el piso " + (i + 1));
                    personasEnPiso = INPUT.nextInt();
                    if (personasEnPiso > maximoPersonasEdificio) {
                        System.out.println("Cupos disponibles " + maximoPersonasEdificio);
                    }
                } while (personasEnPiso > maximoPersonasEdificio && maximoPersonasEdificio != 0);
                listaDeOficinas.add(new Oficina(i + 1, personasEnPiso));
            }
        }
        return listaDeOficinas;
    }
}
