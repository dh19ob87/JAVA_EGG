/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer7.Servicio;

import javapooeggexer7.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PersonaServicio {

    public static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

        System.out.println("Por favor ingrese el nombre.");
        nombre = INPUT.next();
        System.out.println("Por favor ingrese la edad.");
        edad = INPUT.nextInt();
        System.out.println("Por favor ingrese el peso de la persona");
        peso = INPUT.nextDouble();
        System.out.println("Por favor ingrese la altura de la persona");
        altura = INPUT.nextDouble();

        do {
            System.out.println("Por favor ingrese el sexo, H <hombre>, M <mujer>, O <otro>");
            sexo = (INPUT.next().charAt(0));
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona person) {
        double imc = person.getPeso() / Math.pow(person.getAltura(), 2);
        return (imc < 20) ? -1 : (imc == 20 || imc <= 25) ? 0 : 1;
    }

    public boolean esMayorDeEdad(Persona person) {
        return (person.getEdad() > 18);
    }

    public void printDataPersona(Persona person) {
        System.out.println(person.toString());
    }
}
