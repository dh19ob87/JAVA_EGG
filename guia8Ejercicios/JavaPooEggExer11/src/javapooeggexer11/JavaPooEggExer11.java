/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer11;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author diego
 */
public class JavaPooEggExer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese una fecha. Día, mes y año; respectivamente.");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        LocalDate fecha = LocalDate.of(anio, Month.of(mes), dia);
        LocalDate fechaHoy = LocalDate.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonth(), LocalDateTime.now().getDayOfMonth());
        System.out.println("--------Método Period--------");
        Period fechaPrecisa = Period.between(fecha, fechaHoy);
        System.out.println("Diferencia --> " + fechaPrecisa.getDays() + " días | " + fechaPrecisa.getMonths() + " meses | " + fechaPrecisa.getYears() + " años");
        System.out.println("--------Método tradicional--------");
        System.out.println(fecha.format(formato));
        System.out.println(fechaHoy.format(formato));
        System.out.println("Años de diferencia = " + (LocalDateTime.now().getYear() - fecha.getYear()));
    }

}
