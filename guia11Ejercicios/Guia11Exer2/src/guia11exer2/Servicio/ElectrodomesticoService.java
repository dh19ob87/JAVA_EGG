/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer2.Servicio;

import guia11exer2.Entidad.Electrodomestico;
import guia11exer2.Enumerables.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ElectrodomesticoService {

    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Electrodomestico crearElectrodomestico() {
        System.out.println("Por favor ingrese color, letra de consumo y peso del electrodomestico");
        return new Electrodomestico(1000, comprobarColor(INPUT.next()), comprobarConsumoEnergetico(INPUT.next()), INPUT.nextDouble());
    }

    private LetrasConsumo comprobarConsumoEnergetico(String letra) {
        for (LetrasConsumo letter : LetrasConsumo.values()) {
            if (letra.equalsIgnoreCase(letter.toString())) {
                return letter;
            }
        }
        return LetrasConsumo.F;
    }

    private Color comprobarColor(String color) {
        for (Color colour : Color.values()) {
            if (color.equalsIgnoreCase(colour.toString())) {
                return colour;
            }
        }

        return Color.BLANCO;
    }
}
