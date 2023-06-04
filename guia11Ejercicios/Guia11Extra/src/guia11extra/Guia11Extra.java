/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11extra;

import guia11extra.Entidad.*;
import guia11extra.Servicio.EdificioDeOficinasServicio;
import guia11extra.Servicio.PolideportivoService;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author diego
 */
public class Guia11Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EdificioDeOficinasServicio officeBuildingService = new EdificioDeOficinasServicio();
        PolideportivoService parkService = new PolideportivoService();
        LinkedList <Edificio> buildings = new LinkedList<>();
        LinkedList <Oficina> oficinas = new LinkedList<>();
        
        //Creación manual de edificios
        
//        buildings.add(officeBuildingService.crearEdificioDeOficinas());
//        buildings.add(parkService.crearPolideportivo());
//        buildings.add(officeBuildingService.crearEdificioDeOficinas());
//        buildings.add(parkService.crearPolideportivo());
//        buildings.add(officeBuildingService.crearEdificioDeOficinas());
//        buildings.add(parkService.crearPolideportivo());

        oficinas.add(new Oficina(1, 10));
        oficinas.add(new Oficina(2, 100));
        oficinas.add(new Oficina(3, 20));
        oficinas.add(new Oficina(4, 120));
        oficinas.add(new Oficina(5, 1065));
        oficinas.add(new Oficina(6, 101));
        oficinas.add(new Oficina(7, 350));
        oficinas.add(new Oficina(8, 280));
        oficinas.add(new Oficina(9, 500));
        oficinas.add(new Oficina(10, 100));
        oficinas.add(new Oficina(11, 70));
        oficinas.add(new Oficina(12, 40));
        
        buildings.add(new Polideportivo("A", true, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("B", true, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("C", false, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("D", false, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("E", true, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("F", true, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("G", true, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("H", true, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        buildings.add(new Polideportivo("I", false, 5d, 5d, 5d));
        buildings.add(new EdificioDeOficinas(oficinas, 1000, 5d, 5d, 5d));
        
        buildings.stream().forEach(edificio -> {
            System.out.printf("Superficie %s = %f \n", 
                    (edificio instanceof EdificioDeOficinas) ? "Edificio " : ("Polideportivo " + Optional.ofNullable(((Polideportivo) edificio).getNombre()).get()),
                    edificio.calcularSuperficie());
            
            System.out.printf("Volumen %s = %f \n", 
                    (edificio instanceof EdificioDeOficinas) ? "Edificio " : ("Polideportivo " + Optional.ofNullable(((Polideportivo) edificio).getNombre()).get()),
                    edificio.calcularVolumen());
        });
                
        System.out.println("Polideportivos techados: " + buildings.stream().filter(edificio -> (edificio instanceof Polideportivo)).filter(techado -> ((Polideportivo) techado).getIsTechado()).count());
        System.out.println("Polideportivos no techados: " + buildings.stream().filter(edificio -> (edificio instanceof Polideportivo)).filter(techado -> !((Polideportivo) techado).getIsTechado()).count());
        buildings.stream().filter(edificio -> (edificio instanceof EdificioDeOficinas)).map(edificio -> ((EdificioDeOficinas) edificio)).forEach(EdificioDeOficinasServicio::cantPersonas);
    }
}
