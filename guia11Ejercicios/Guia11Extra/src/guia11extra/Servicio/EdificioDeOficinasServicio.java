/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra.Servicio;

import guia11extra.Entidad.EdificioDeOficinas;
import guia11extra.Entidad.Oficina;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class EdificioDeOficinasServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public EdificioDeOficinas crearEdificioDeOficinas() {
        int pisos;
        int maximoPersonasEdificio;
        LinkedList<Oficina> oficinas;
        OficinaService officeService = new OficinaService();
        System.out.println("""
                           Bienvenido
                           
                           Vamos a proceder a crear un edificio de oficinas.
                           
                           Por favor ingrese la cantidad máxima de personas del edificio
                           """);
        maximoPersonasEdificio = INPUT.nextInt();
        System.out.println("Por favor ingrese la cantidad de oficinas (pisos) que tiene el edificio");
        pisos = INPUT.nextInt();
        oficinas = officeService.crearOficinas(pisos, maximoPersonasEdificio);
        System.out.println("Finalmente ingrese el ancho, alto y largo del edificio");
        return new EdificioDeOficinas(oficinas, maximoPersonasEdificio, INPUT.nextDouble(), INPUT.nextDouble(), INPUT.nextDouble());
    }
    
    public void printData(EdificioDeOficinas building){
        System.out.println(building.toString());
    }
    
    public void printOfficesInBuilding(List<EdificioDeOficinas> builds){
        builds.stream().map(edificio -> edificio.getOficinas()).forEach(System.out::println);
        builds.stream().map(edificio -> edificio.getOficinas()).flatMap(oficina -> oficina.stream()).map(data -> data.getMaxPersonasEnOficina()).forEach(System.out::println);
        System.out.println("Sumatoria personas en todas las oficinas: " + builds.stream().map(build -> build.getOficinas()).flatMap(officeStream -> officeStream.stream())
                .map(personasOficina -> personasOficina.getMaxPersonasEnOficina()).reduce(0, (a, b) -> a + b));
    }
    
    public static void cantPersonasLista(List <EdificioDeOficinas> builds){
        builds.stream().peek(edificio -> {System.out.println(edificio.getMaxPersonasEdificio());}).map(edificio -> edificio.getOficinas()).flatMap(piso -> piso.stream()).forEach(System.out::println);
    }
    
    public static void cantPersonas (EdificioDeOficinas builds){
        System.out.printf("Cantidad máxima de personas en el edificio: %d \n", builds.getMaxPersonasEdificio());
        builds.getOficinas().stream().forEach(System.out::println);
    }
}
