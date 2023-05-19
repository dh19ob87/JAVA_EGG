/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Servicio;

import guia10extra2.Entidad.Cine;
import guia10extra2.Entidad.Asiento;
import guia10extra2.Entidad.Espectador;
import guia10extra2.Entidad.Sala;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author diego
 */
public class CineServicio {

    private PeliculaServicio ps = new PeliculaServicio();
    private SalaServicio ss = new SalaServicio();
    private EspectadorServicio es = new EspectadorServicio();

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Cine crearCine() {
        System.out.println("Por favor ingrese el valor de la entrada a la sala");
        double precioEntrada = INPUT.nextDouble();
        return new Cine(ps.crearPelicula(), crearSalas(), precioEntrada);
    }

    private ArrayList<Sala> crearSalas() {
        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(ss.crearSala());
        return salas;
    }

    public void venderEntrada(Cine cinema, ArrayList<Espectador> personasRegistradas) {
        Espectador cliente = darIngresoUsuario(personasRegistradas);
        if (cliente.getSaldoDisponible() < cinema.getPrecioEntrada()) {
            System.out.println("No cuentas con saldo suficiente para efectuar la compra.");
        } else if (!quedanAsientosDisponibles(cinema)) {
            System.out.println("Lo sentimos no quedan asientos para esa función.");
        } else if (cliente.getEdad() < cinema.getPeliculaReproduciendo().getEdadMinima()) {
            System.out.println("Lo sentimos no tienes la edad suficiente para ver este contenido.");
        } else {
            cliente.setSaldoDisponible(cliente.getSaldoDisponible() - cinema.getPrecioEntrada());
            cliente.setPuesto(ubicarUsuario(cinema));
            cinema.getSalas().get(0).getPersonasEnSala().add(cliente);
        }
    }

    public boolean quedanAsientosDisponibles(Cine cinema) {
        return cinema.getSalas().get(0).getPuestos().stream().filter(fila -> fila.stream().filter(puesto -> puesto.getOcupado() == false).collect(Collectors.toList()).get(0).getOcupado() == false).count() > 0;
    }

    public Asiento ubicarUsuario(Cine cinema) {
        Asiento silla = cinema.getSalas().get(0).getPuestos().stream().filter(fila -> fila.stream().filter(puesto -> puesto.getOcupado() == false).collect(Collectors.toList()).get(0).getOcupado() == false).findFirst().get().stream().filter(puesto -> puesto.getOcupado() == false).findFirst().get();
        silla.setOcupado(true);
        return silla;
    }

    public Espectador darIngresoUsuario(ArrayList<Espectador> personasRegistradas) {

        personasRegistradas.forEach(System.out::println);
        System.out.println("-----------------");
        String nombre;
        System.out.println("Por favor ingrese el nombre de la persona a registrar");
        nombre = INPUT.next();
        
        return personasRegistradas.stream().filter(persona -> persona.getNombre().equalsIgnoreCase(nombre)).findFirst().get();
    }

    public void iniciarJornadaLaboral(Cine cinema) {
        int salir;
        ArrayList<Espectador> usuariosRegistrados = new ArrayList<>();

        do {
            System.out.println("Bienvenido al cine\n1.Registrar usuario\n2. Imprimir usuarios registrados\n3. Vender entrada\n4. Mostrar personas en sala\n5. Imprimir datos película\n6. Imprimir puestos sala\n0. Salir");
            salir = INPUT.nextInt();
            switch (salir) {
                case 0 ->
                    System.out.println("Hasta pronto");
                case 1 -> {
                    usuariosRegistrados.add(es.crearEspectador());
                }
                case 2 ->
                    usuariosRegistrados.forEach(System.out::println);
                case 3 -> {
                    if (usuariosRegistrados.isEmpty()) {
                        System.out.println("Primero debes registrar el usuario.");
                    } else {
                        usuariosRegistrados.forEach(System.out::println);
                        System.out.println("-----------------------------------------------");
                        venderEntrada(cinema, usuariosRegistrados);
                        ss.imprimirEstadoSala(cinema.getSalas().get(0));
                    }
                }
                case 4 -> {
                    cinema.getSalas().get(0).getPersonasEnSala().forEach(System.out::println);
                }
                case 5 -> System.out.println(cinema.getPeliculaReproduciendo().toString());
                case 6 -> ss.imprimirEstadoSala(cinema.getSalas().get(0));
                default ->
                    System.out.println("Opción no registrada");
            }
        } while (salir != 0);
    }
}
