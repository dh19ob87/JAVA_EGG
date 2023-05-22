/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Servicio;

import java.util.Scanner;
import guia10extra3.Entidad.Cuotas;
import guia10extra3.Enumerables.FormasDePago;
import java.time.LocalDate;
import static java.util.Locale.US;
/**
 *
 * @author diego
 */
public class CuotasServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(US);
    
    public Cuotas crearCuotas (int numeroDeCuota){
        double montoCuota;
        int dia, mes, anio;
        String formaDePago;
        
        System.out.println("Por favor ingrese el monto total de cuota " + (numeroDeCuota + 1));
        montoCuota = INPUT.nextDouble();
        System.out.println("Por favor ingrese la fecha de vencimiento");
        System.out.println("Día");
        dia = INPUT.nextInt();
        System.out.println("Mes");
        mes = INPUT.nextInt();
        System.out.println("Año");
        anio = INPUT.nextInt();
        System.out.println("Por favor ingrese la forma de pago");
        imprimirFormasDePago();
        formaDePago = INPUT.next().toUpperCase();
        
        return new Cuotas (numeroDeCuota, montoCuota, false, LocalDate.of(anio, mes, dia), FormasDePago.valueOf(formaDePago));
    }
    
    public void imprimirFormasDePago (){
        for(FormasDePago elemento : FormasDePago.values()){
            System.out.println(elemento);
        }
    }
}
