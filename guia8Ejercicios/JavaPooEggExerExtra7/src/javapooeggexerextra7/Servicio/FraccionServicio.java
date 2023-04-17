/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra7.Servicio;

import javapooeggexerextra7.Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FraccionServicio {

    public Fraccion crearOperandos() {
        System.out.println("Por favor ingrese  las fracciones.");
        return new Fraccion(new Scanner(System.in).useDelimiter("\n").nextInt(), validarDenominador(), new Scanner(System.in).useDelimiter("\n").nextInt(), validarDenominador());
    }

    public int validarDenominador() {

        int denominador;

        do {
            denominador = new Scanner(System.in).useDelimiter("\n").nextInt();
            if (denominador == 0) {
                System.out.println("La división entre cero no está definida. Vuelva a ingresar el denominador por favor.");
            }
        } while (denominador == 0);

        return denominador;
    }

    public void menuOperaciones(Fraccion frac) {
        int operacion;
        do {
            System.out.println("====Bienvenido====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("Operación: ");
            operacion = new Scanner(System.in).useDelimiter("\n").nextInt();

            switch (operacion) {
                case 1:
                    sumar(frac);
                    break;
                case 2:
                    restar(frac);
                    break;
                case 3:
                    multiplicar(frac);
                    break;
                case 4:
                    dividir(frac);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Operación no permitida.");
            }

        } while (operacion != 0);

    }

    public void sumar(Fraccion frac) {
        System.out.printf("Suma = %d / %d \n", (frac.getDenominadorA() == frac.getDenominadorB()) ? frac.getNumeradorA() + frac.getNumeradorB() : (frac.getNumeradorA() * frac.getDenominadorB()) + (frac.getNumeradorB() * frac.getDenominadorA()), (frac.getDenominadorA() == frac.getDenominadorB()) ? frac.getDenominadorA() : frac.getDenominadorA() * frac.getDenominadorB());
    }

    public void restar(Fraccion frac) {
        System.out.printf("Resta = %d / %d \n", (frac.getDenominadorA() == frac.getDenominadorB()) ? frac.getNumeradorA() - frac.getNumeradorB() : (frac.getNumeradorA() * frac.getDenominadorB()) - (frac.getNumeradorB() * frac.getDenominadorA()), (frac.getDenominadorA() == frac.getDenominadorB()) ? frac.getDenominadorA() : (frac.getDenominadorA() * frac.getDenominadorB()));
    }

    public void multiplicar(Fraccion frac) {
        System.out.printf("Multiplicación = %d / %d \n", frac.getNumeradorA() * frac.getNumeradorB(), frac.getDenominadorA() * frac.getDenominadorB());
    }

    public void dividir(Fraccion frac) {
        System.out.printf("División = %d / %d \n", frac.getNumeradorA() * frac.getDenominadorB(), frac.getNumeradorB() * frac.getDenominadorA());
    }

}
