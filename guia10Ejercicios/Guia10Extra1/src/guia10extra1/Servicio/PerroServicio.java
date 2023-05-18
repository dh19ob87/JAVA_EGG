/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra1.Servicio;

import guia10extra1.Entidad.Perro;
import guia10extra1.Entidad.Persona;
import guia10extra1.Enumerables.RazasCanes;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author diego
 */
public class PerroServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private static LinkedList<Perro> perrosEnAdopcion = new LinkedList<>();

    public Perro crearMascota() {
        String raza;
        do {
            System.out.println("Por favor ingrese la raza del perro");
            for (RazasCanes elemento : RazasCanes.values()) {
                System.out.println(elemento);
            }
            raza = INPUT.next();
        } while (!getRaza(raza));

        System.out.println("Por favor ingrese el nombre, edad y tamaño del perro");
        return new Perro(INPUT.next(), RazasCanes.valueOf(raza.toUpperCase()), INPUT.nextInt(), INPUT.nextDouble());
    }

    public void crearPerrosEnAdopcion() {
        perrosEnAdopcion.add(new Perro("Milu", RazasCanes.BEAGLE, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Parry", RazasCanes.AFGANO, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Tom", RazasCanes.BULLDOG, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Jerry", RazasCanes.CHIHUAHUA, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Goku", RazasCanes.COCKER, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Fiona", RazasCanes.DOBERMAN, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Shrek", RazasCanes.GOLDEN_RETRIEVER, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Vegeta", RazasCanes.HUSKY, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Milagros", RazasCanes.LABRADOR, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Canela", RazasCanes.POMERANIA, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Encontrado", RazasCanes.POODLE, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Mariana", RazasCanes.BEAGLE, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Aragon", RazasCanes.BULLDOG, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Dodger", RazasCanes.POMERANIA, 4, 24.5));
        perrosEnAdopcion.add(new Perro("Godzila", RazasCanes.POODLE, 4, 24.5));
    }

    public Boolean hayLomitos() {
        return perrosEnAdopcion.isEmpty();
    }

    public Boolean porAdoptar(Iterator<Perro> iter, String nombreMascota) {
        if (!iter.hasNext()) {
            return false;
        } else if (iter.next().getNombre().equalsIgnoreCase(nombreMascota)) {
            return true;
        } else {
            return porAdoptar(iter, nombreMascota);
        }
    }

    public int porAdoptar(Iterator<Perro> iter, String nombreMascota, int posicion) {
        if (!iter.hasNext()) {
            return -1;
        } else if (iter.next().getNombre().equalsIgnoreCase(nombreMascota)) {
            return posicion;
        } else {
            posicion++;
            return porAdoptar(iter, nombreMascota, posicion);
        }
    }

    public void darPerroEnAdopcion(Persona adoptante) {
        System.out.printf("Bienvenido %s, tienes %d lomitos adoptados:\n", adoptante.getNombre() + " " + adoptante.getApellido(), (adoptante.getMascota().isEmpty()) ? 0 : adoptante.getMascota().size());
        System.out.println("Muchísimas gracias. Confiamos en ti. A continuación la lista de lomitos disponibles para adopción");
        perrosEnAdopcion.forEach(System.out::println);
        System.out.println("Por favor ingrese el nombre del lomito a adoptar:");
        String nombreLomito;
        do {
            nombreLomito = INPUT.next();
            if (!porAdoptar(perrosEnAdopcion.iterator(), nombreLomito)) {
                System.out.println("No hay ningún lomito registrado con ese nombre.\nIntente nuevamente.");
            }
        } while (!porAdoptar(perrosEnAdopcion.iterator(), nombreLomito));

        adoptante.getMascota().add(perrosEnAdopcion.remove(porAdoptar(perrosEnAdopcion.iterator(), nombreLomito, 0)));
    }
    
    public void imprimirLomitosEnAdopcion (){
        perrosEnAdopcion.forEach(System.out::println);
    }

    public boolean getRaza(String raza) {
        boolean find = false;
        for (RazasCanes elemento : RazasCanes.values()) {
            if (elemento.toString().equalsIgnoreCase(raza)) {
                find = true;
                break;
            }
        }
        return find;
    }
}
