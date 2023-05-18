/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Servicio;

import guia10extra2.Entidad.Sala;
import guia10extra2.Entidad.Asiento;
import guia10extra2.Enumerable.LetrasAsiento;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class SalaServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private AsientoServicio as = new AsientoServicio();
    
    public Sala crearSala (){
        System.out.println("Por favor ingrese el numero identificador de la sala y el nombre de la sala");
        return new Sala(INPUT.nextInt(), INPUT.next(), crearMatrizAsientos(), new ArrayList<>());
    }
    
    private ArrayList <ArrayList <Asiento>> crearMatrizAsientos(){
        ArrayList<ArrayList<Asiento>> puestos = new ArrayList<>();
        ArrayList <Asiento> silla = new ArrayList<>();
        
        for(LetrasAsiento elemento : LetrasAsiento.values()){
            for (int i = 1; i <= 8; i++) {
                silla.add(as.crearAsiento(i, elemento));
            }
        }
        puestos.add(silla);
        
        return puestos;
    }
    
    public void imprimirEstadoSala(Sala sala){
        sala.getPuestos().forEach(fila -> {
           fila.forEach(puesto -> {
               System.out.printf("%d %s %s ", puesto.getIdAsiento(), puesto.getLetra(), (puesto.getOcupado()) ? "X" : " ");
               if(puesto.getIdAsiento() == 8){
                   System.out.println("");
               }
           });
        });
    }
}
