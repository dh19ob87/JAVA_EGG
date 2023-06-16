/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12e3.Servicio;

import g12e3.Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class DivisionNumeroServicio {

    public void dividir() throws Exception, NumberFormatException, ArithmeticException, InputMismatchException {
        DivisionNumero operandos = new DivisionNumero();
        int salir = 5;
        String x;
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        do {
            try {
                System.out.println("""
                               Bienvenido
                               
                               1. Dividir
                               0. Salir
                               """);
                salir = Integer.parseInt(input.next());
                switch (salir) {
                    case 0 ->{
                        x = input.next();
                        System.out.println("Adiós");}
                    case 1 -> {
                        System.out.println("Por favor ingrese el numerador");
                        operandos.setNumerador(Integer.valueOf(input.next()));
                        System.out.println("Por favor ingrese el denominador");
                        operandos.setDenominador(Integer.valueOf(input.next()));
                        System.out.println("Resultado: " + operandos.getNumerador() / operandos.getDenominador());
                    }
                    default -> {
                        System.out.println("Opción no permitida");
                        throw new Exception("Opción no válida");
                    }
                }
            } catch (NumberFormatException | ArithmeticException | InputMismatchException e) {
                System.out.println(e.fillInStackTrace());
                 Logger.getLogger(DivisionNumeroServicio.class.getName()).log(Level.SEVERE, "opción no válida", e);
            }
        } while (salir != 0);
    }
}
