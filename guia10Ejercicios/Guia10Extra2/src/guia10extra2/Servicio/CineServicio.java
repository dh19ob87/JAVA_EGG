/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Servicio;

import guia10extra2.Entidad.Cine;
import guia10extra2.Entidad.Espectador;
import guia10extra2.Entidad.Sala;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CineServicio {
    
    private PeliculaServicio ps = new PeliculaServicio();
    private SalaServicio ss =  new SalaServicio();
    private EspectadorServicio es = new EspectadorServicio();
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Cine crearCine (){
        System.out.println("Por favor ingrese el valor de la entrada a la sala");
        double precioEntrada = INPUT.nextDouble();
        return new Cine(ps.crearPelicula(), crearSalas(), precioEntrada);
    }
    
    private ArrayList<Sala> crearSalas(){
        ArrayList <Sala> salas = new ArrayList<>();
        salas.add(ss.crearSala());
        return salas;
    }
    
    public void venderEntrada(Cine cinema){
        
    }
    
    public void iniciarJornadaLaboral (Cine cinema){
        int salir;
        do {
            System.out.println("Bienvenido al cine\n1.Registrar usuario\n2. Vender entrada\n3. Cambiar puesto\n4. Mostrar personas en sala\n0. Salir");
            salir = INPUT.nextInt();
            switch (salir) {
                case 0 -> System.out.println("Hasta pronto");
                case 1 -> {
                    Espectador usuario = es.crearEspectador();
                    usuario.setSalaProyeccion(cinema.getSalas().get(0));
                    usuario.setPuesto(cinema.getSalas().get(0).getPuestos().get(0).get(0));
                    ss.imprimirEstadoSala(cinema.getSalas().get(0));
                    cinema.getSalas().get(0).getPersonasEnSala().add(usuario);
                }
                case 2 -> es.crearEspectador();
                case 3 -> System.out.println("Pero para qué escogió ese puesto y vaya usted a saber si hay más disponibles");
                default -> System.out.println("Opción no registrada");
            }
        } while (salir!= 0);
    }
}
