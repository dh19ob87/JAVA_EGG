/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer5.Servicio;

import guia9ejer5.Entidad.Country;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

/**
 *
 * @author diego
 */
public class CountryService {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Set<Country> crearPaises() {
        return new TreeSet<>();
    }

    public void menu(Set<Country> countries) {
        int salir = 0;

        do {
            System.out.println("Bienvenido");
            System.out.println("1. Agregar paises \n2. Agregar un país \n3. Buscar un país \n4. Imprimir países orden ascendente \n5. Imprimir países orden descendente \n6. Modificar un país \n7. Eliminar un país \n8. Eliminar todos los países \n9. Cantidad de países registrados \n0. Salir \nPor favor ingrese una opción:");
            salir = INPUT.nextInt();

            switch (salir) {
                case 0:
                    System.out.println("Hasta pronto.");
                    break;
                case 1:
                    int terminar = 0;
                    do {
                        agregarPais(countries);
                        System.out.printf("Países registrados: %d \n ¿Desea agregar otro país? | 1. Sí | 0. No \n", countries.size());
                        terminar = INPUT.nextInt();
                    } while (terminar != 0);
                    break;
                case 2:
                    agregarPais(countries);
                    break;
                case 3:
                    System.out.printf("País %s \n", (buscarPais(countries)) ? "registrado." : "no registrado.");
                    break;
                case 4:
                    imprimirSetAsc(countries);
                    break;
                case 5:
                    imprimirSetDesc(countries);
                    break;
                case 6:
                    modificarPais(countries);
                    break;
                case 7:
                    eliminarPais(countries);
                    break;
                case 8:
                    countries.clear();
                    System.out.println("Países registrados: " + countries.size());
                    break;
                case 9:
                    System.out.println("Países registrados: " + countries.size());
                    break;
                default:
                    System.out.println("¡Operación no permitida!");
            }
        } while (salir != 0);

    }

    public void agregarPais(Set<Country> countries) {
        System.out.println("Por favor ingrese el nombre del país a agregar");
        System.out.printf("Operación %s", (countries.add(new Country(INPUT.next())) ? "exitosa" : "no exitosa, elemento repetido. \n"));
    }

    public boolean buscarPais(Set<Country> countries) {
        System.out.println("Por favor ingrese el país que desea buscar:");
        return countries.contains(new Country(INPUT.next()));
    }

    public boolean buscarPais(Set<Country> countries, String pais) {
        return countries.contains(new Country(pais));
    }

    public void modificarPais(Set<Country> countries) {
        
        String nuevoPais, pais;
        
        System.out.println("Por favor ingrese el nombre del país a modificar");
        pais = INPUT.next();
        if (buscarPais(countries, pais)) {
            
            System.out.println("Por favor ingrese el nuevo nombre");
            
            nuevoPais = INPUT.next();
            
            Iterator<Country> iter = countries.iterator();
            
            while (iter.hasNext()) {
                Country next = iter.next();
                if (next.getPais().equalsIgnoreCase(pais)) {
                    next.setPais(nuevoPais);
                }
            }
        } else {
            System.out.println("País no encontrado.");
        }
    }

    public void eliminarPais(Set<Country> countries) {
        Iterator<Country> iter = countries.iterator();
        System.out.println("Por favor ingrese el país a eliminar");
        String pais;
        pais = INPUT.next();

        while (iter.hasNext()) {
            Country next = iter.next();
            if (next.getPais().equalsIgnoreCase(pais)) {
                iter.remove();
            }
        }
    }

    public void imprimirSetAsc(Set<Country> countries) {
        System.out.println(countries);
    }

    public void imprimirSetDesc(Set<Country> countries) {
        System.out.println(new TreeSet<>(countries).descendingSet());
    }
}
