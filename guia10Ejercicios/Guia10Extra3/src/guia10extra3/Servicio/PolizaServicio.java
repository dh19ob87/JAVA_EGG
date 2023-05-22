/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Servicio;

import guia10extra3.Entidad.Poliza;
import guia10extra3.Entidad.Persona;
import guia10extra3.Entidad.Cuotas;
import guia10extra3.Enumerables.FormasDePago;
import guia10extra3.Enumerables.TiposDeCobertura;
import guia10extra3.Utilidades.Comparadores;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;

/**
 *
 * @author diego
 */
public class PolizaServicio {

    private static long numeroDePoliza = 0;
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private static CuotasServicio cs = new CuotasServicio();
    private static PersonaServicio ps = new PersonaServicio();
    private static VehiculoServicio vs = new VehiculoServicio();

    public Poliza crearPoliza() {
        Persona propietario = ps.crearPersona();
        int dia, mes, anio, cantidadDeCuotas;
        double montoTotalAsegurado, montoTotalGranizo = 0;
        boolean granizo;
        String formaDePago, tipoDeCobertura;
        ++numeroDePoliza;
        System.out.println("Por favor ingrese la fecha de final de cobertura");
        System.out.println("Día:");
        dia = INPUT.nextInt();
        System.out.println("Mes");
        mes = INPUT.nextInt();
        System.out.println("Año");
        anio = INPUT.nextInt();
        System.out.println("¿Cuántas cuotas desea generar?");
        cantidadDeCuotas = INPUT.nextInt();
        System.out.println("¿Qué forma de pago desea?");
        imprimirFormasDePago();
        formaDePago = INPUT.next().toUpperCase();
        System.out.println("Por favor ingrese el monto total asegurado");
        montoTotalAsegurado = INPUT.nextDouble();
        System.out.println("¿Desea asegurar su carro contra granizadas? 0 (SÍ) 1 (NO)");
        granizo = INPUT.nextInt() == 0;
        if (granizo) {
            System.out.println("Por favor ingrese el monto total asegurado para granizadas");
            montoTotalGranizo = INPUT.nextDouble();
        }
        System.out.println("Por favor ingrese el tipo de cobertura de la póliza");
        imprimirTipoDeCobertura();
        tipoDeCobertura = INPUT.next().toUpperCase();
        return new Poliza (propietario, vs.crearVehiculo(propietario), numeroDePoliza, LocalDate.now(), LocalDate.of(anio, mes, dia), cantidadDeCuotas, FormasDePago.valueOf(formaDePago), montoTotalAsegurado, granizo, montoTotalGranizo, TiposDeCobertura.valueOf(tipoDeCobertura), crearCuotas(cantidadDeCuotas, cs));
    }

    private void imprimirFormasDePago() {
        for (FormasDePago forma : FormasDePago.values()) {
            System.out.println(forma);
        }
    }

    private void imprimirTipoDeCobertura() {
        for (TiposDeCobertura tipo : TiposDeCobertura.values()) {
            System.out.println(tipo);
        }
    }

    private LinkedList<Cuotas> crearCuotas(int numeroDeCuotas, CuotasServicio cs) {
        LinkedList<Cuotas> cuotasPoliza = new LinkedList<>();
        for (int i = 0; i < numeroDeCuotas; i++) {
            cuotasPoliza.add(cs.crearCuotas(i));
        }
        return cuotasPoliza;
    }

    /*
    private Persona acreedor;
    private Vehiculo auto;
    private long numeroDePoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private int cantidadDeCuotas;
    private T formaDePago;
    private double montoTotalAsegurado;
    private boolean granizo;
    private double montoMaximoGranizo;
    private G tipoDeCobertura;
    private LinkedList <Cuotas> cuotas;
     */
    public void imprimirPoliza(Poliza seguro) {
        System.out.println(seguro.toString());
        System.out.println("===================Titular Póliza===================");
        System.out.printf("nombre: %s\napellido: %s\nDNI: %d\nEmail: %s\nDirección: %s\nNúmero Celular: %d\n",
                seguro.getAcreedor().getNombre(), seguro.getAcreedor().getApellido(), seguro.getAcreedor().getDni(), seguro.getAcreedor().getEmail(), seguro.getAcreedor().getAddress(), seguro.getAcreedor().getNumeroCelular());
        System.out.println("===================Vehiculo Asegurado===================");
        System.out.printf("marca: %s\nmodelo: %s\nnumero de motor: %d\nCódigo chasis: %s\nColor: %s\nTipo de auto: %s\nNombre propietario: %s\nDNI propietario: %d",
                seguro.getAuto().getMarca(), seguro.getAuto().getModelo(), seguro.getAuto().getNumeroDeMotor(), seguro.getAuto().getChasis(), seguro.getAuto().getColor(), seguro.getAuto().getTipoAuto(), seguro.getAuto().getPropietario().getNombre(), seguro.getAuto().getPropietario().getDni());
        System.out.println("===================Datos Póliza===================");
        System.out.printf("numero póliza: %d\nfecha inicio: %s\nfecha final: %s\ncantidad de cuotas: %d\nforma de pago: %s\nmonto total asegurado %f\ncubre granizo: %b\n%s\ntipo de cobertura: %s\n",
                seguro.getNumeroDePoliza(), seguro.getFechaInicio().toString(), seguro.getFechaFinal().toString(), seguro.getCantidadDeCuotas(), seguro.getFormaDePago(),
                seguro.getMontoTotalAsegurado(), seguro.isGranizo(), (seguro.isGranizo()) ? seguro.getMontoMaximoGranizo() : 0, seguro.getTipoDeCobertura());
        System.out.println("===================Cuotas===================");
        imprimirCuotasPoliza(seguro.getCuotas());
    }

    private void imprimirCuotasPoliza(LinkedList<Cuotas> cuotasHistorial) {
        cuotasHistorial.forEach(System.out::println);
    }

    private void imprimirPolizas(LinkedList<Poliza> seguros) {
        if (seguros.isEmpty()) {
            System.out.println("No hay polizas activas o vendidas");
        } else {
            seguros.forEach(seguro -> imprimirPoliza(seguro));
        }
    }

    public void eliminarPoliza(LinkedList<Poliza> seguros) {
        long numeroPoliza;
        if (seguros.isEmpty()) {
            System.out.println("No hay seguros vendidos.");
        } else {
            System.out.println("Por favor ingrese el número de póliza a eliminar");
            imprimirPolizas(seguros);
            numeroPoliza = INPUT.nextInt();
            Iterator<Poliza> iter = seguros.iterator();
            while (iter.hasNext()) {
                Poliza next = iter.next();
                if (next.getNumeroDePoliza() == numeroPoliza) {
                    iter.remove();
                }
            }
        }
    }

    public void iniciarJornada() {
        int salir;
        LinkedList<Poliza> polizasVendidas = new LinkedList<>();
        do {
            System.out.println("Bienvenido\n1.Crear poliza\n2.Eliminar poliza\n3.Imprimir Usuarios registrados\n4.Imprimir pólizas ordenadas por DNI cliente ascendente\n5.Imprimir pólizas ordenadas por DNI cliente descendente\n0. Salir");
            salir = INPUT.nextInt();
            switch (salir) {
                case 0 ->
                    System.out.println("Hasta pronto.");
                case 1 ->
                    polizasVendidas.add(crearPoliza());
                case 2 -> {
                    eliminarPoliza(polizasVendidas);
                }
                case 3 ->
                    ps.imprimirPersonasRegistradas();
                case 4 -> {
                    Collections.sort(polizasVendidas, Comparadores.ordenarPolizaPorPropietarioAsc);
                    imprimirPolizas(polizasVendidas);
                }
                case 5 -> {
                    Collections.sort(polizasVendidas, Comparadores.ordenarPolizaPorPropietarioDesc);
                    imprimirPolizas(polizasVendidas);
                }
//                case 6 -> Collections.sort(polizasVendidas, Collections.reverseOrder(Comparadores.ordenarPolizaPorPropietarioAsc));
                default ->
                    System.out.println("Operación no permitida");
            }

        } while (salir != 0);
    }
}
