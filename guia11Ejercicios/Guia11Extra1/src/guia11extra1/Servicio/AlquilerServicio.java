/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Interfaces.CalculoAlquiler;
import guia11extra1.Entidad.Alquiler;
import guia11extra1.Entidad.Motorizado;
import guia11extra1.Entidad.Velero;
import guia11extra1.Entidad.YateLujo;
import guia11extra1.Entidad.Amarre;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;
/**
 *
 * @author diego
 */
public class AlquilerServicio {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Alquiler crearAlquiler(Amarre puesto) {
        BarcoServicio bs = new BarcoServicio();
        VeleroServicio vs = new VeleroServicio();
        YateLujoServicio ys = new YateLujoServicio();
        MotorizadoServicio ms = new MotorizadoServicio();
        puesto.setOcupado(true);

        System.out.println("Por favor ingrese el nombre del cliente");
        String nombreCliente = INPUT.next();
        System.out.println("Por favor ingrese el DNI del cliente");
        Long dniCliente = INPUT.nextLong();
        System.out.println("Por favor ingrese el año de devolución:");
        int anio = INPUT.nextInt();
        System.out.println("Por favor ingrese el mes de devolución:");
        int mes = INPUT.nextInt();
        System.out.println("Por favor ingrese el día de devolución:");
        int dia = INPUT.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anio, mes, dia);
        System.out.println("""
                           Por favor ingresa el tipo de barco que vas a poner en el amarre:
                           1.Barco est\u00e1ndart
                           2.Velero
                           3. Motorizado
                           4.Yate de lujo""");
        int tipoBarco = INPUT.nextInt();
        return new Alquiler(nombreCliente, dniCliente, LocalDate.now(), fechaDevolucion, puesto, (tipoBarco == 2) ? vs.crearVelero() : (tipoBarco == 3) ? ms.crearBarcoMotorizado() : (tipoBarco == 4) ? ys.crearyateDeLujo() : bs.crearBarco());
    }

    public void printDataAlquiler(Alquiler rent) {
        System.out.println(rent.toString() + " , Precio Alquiler = " + precioAlquiler(rent));
    }

    public Double precioAlquiler(Alquiler rent) {
        CalculoAlquiler barco = (Alquiler cobro) -> ChronoUnit.DAYS.between(rent.getFechaAlquiler(), rent.getFechaDevolucion()) * (cobro.getBarco().getEslora() * 10);
        CalculoAlquiler velero = (Alquiler cobro) -> (ChronoUnit.DAYS.between(rent.getFechaAlquiler(), rent.getFechaDevolucion()) * ((cobro.getBarco().getEslora() * 10))) + ((Velero) cobro.getBarco()).getCantidadMastiles();
        CalculoAlquiler yateDeLujo = (Alquiler cobro) -> (ChronoUnit.DAYS.between(rent.getFechaAlquiler(), rent.getFechaDevolucion()) * (cobro.getBarco().getEslora() * 10)) + (((YateLujo) cobro.getBarco()).getCantidadCamarotes() + ((YateLujo) cobro.getBarco()).getPotenciaCv());
        CalculoAlquiler barcoMotorizado = (Alquiler cobro) -> (ChronoUnit.DAYS.between(rent.getFechaAlquiler(), rent.getFechaDevolucion()) * (cobro.getBarco().getEslora() * 10)) + (((Motorizado) cobro.getBarco()).getPotenciaCv());
        return (rent.getBarco() instanceof Velero) ? velero.precioAlquiler(rent) : (rent.getBarco() instanceof Motorizado) ? barcoMotorizado.precioAlquiler(rent) : (rent.getBarco() instanceof YateLujo) ? yateDeLujo.precioAlquiler(rent) : barco.precioAlquiler(rent);
    }

    public void abrirPuerto() {
        AmarreServicio as = new AmarreServicio();
        ArrayList<Amarre> amarresDisponibles = as.crearAmarres();
        ArrayList<Alquiler> rentas = new ArrayList<>();
        int salir;
        do {
            System.out.println("""
                               Bienvenido
                               1. Alquilar amarre
                               2. Ver amarres disponibles
                               3. Ver total alquileres
                               -----4. Entregar amarre
                               0. Salir
                               """);
            salir = INPUT.nextInt();
            
            switch (salir) {
                case 1 -> {
                    if (!amarresDisponibles.stream().anyMatch(elemento -> !elemento.isOcupado())) {
                        System.out.println("Lo sentimos no hay más amarres disponibles");
                    } else {
                        System.out.printf("Operación %s \n", (rentas.add(crearAlquiler(amarresDisponibles.stream().filter(elemento -> !elemento.isOcupado()).findFirst().get()))) ? "exitosa" : "fallida");
                        rentas.get(rentas.size()-1).setPrecioAlquiler(precioAlquiler(rentas.get(rentas.size()-1)));
                        System.out.println("Precio renta: " + rentas.get(rentas.size()-1).getPrecioAlquiler());
                    }
                }
                case 2 -> amarresDisponibles.stream().filter(amarre -> !amarre.isOcupado()).collect(Collectors.toList()).forEach(System.out::println);
                case 3 -> rentas.forEach(System.out::println);
                default -> System.out.println("Opción no permitida");
            }
        } while (salir != 0);
    }
}
