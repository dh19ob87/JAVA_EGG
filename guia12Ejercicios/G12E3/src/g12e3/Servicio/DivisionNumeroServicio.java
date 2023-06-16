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
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author diego
 */
public class DivisionNumeroServicio {

    public void dividir() throws Exception, NumberFormatException, ArithmeticException, InputMismatchException {
        
        Logger logger = Logger.getLogger(DivisionNumero.class.getName());
        FileHandler handler = new FileHandler(DivisionNumeroServicio.class.getName() + "_log.txt");
        handler.setFormatter(new SimpleFormatter());
        
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        
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
                        logger.log(Level.INFO, "numerador registrado {0}", operandos.getNumerador());
                        System.out.println("Por favor ingrese el denominador");
                        operandos.setDenominador(Integer.valueOf(input.next()));
                        logger.log(Level.INFO, "denominador registrado {0}", operandos.getDenominador());
                        System.out.println("Resultado: " + operandos.getNumerador() / operandos.getDenominador());
                        logger.log(Level.INFO, "Resultado división: {0}", operandos.toString());
                    }
                    default -> {
                        System.out.println("Opción no permitida");
                        throw new Exception("Opción no válida");
                    }
                }
            } catch (NumberFormatException | ArithmeticException | InputMismatchException e) {
                System.out.println(e.fillInStackTrace());
                e.printStackTrace();
                 logger.log(Level.SEVERE, "Error de tipo de dato", e);
            }
        } while (salir != 0);
    }
}
