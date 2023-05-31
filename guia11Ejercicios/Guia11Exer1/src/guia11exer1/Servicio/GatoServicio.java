/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Servicio;

import guia11exer1.Entidad.Gato;
import guia11exer1.Enumerables.RazaGatos;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class GatoServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Gato crearGato(){
        System.out.println("Por favor ingrese el nombre, alimento, edad y raza del gato");
        return new Gato(INPUT.next(), INPUT.next(), INPUT.nextInt(), RazaGatos.TAMMY);
    }
    
    public void sonar (Gato cat){
        cat.sonidoAnimal();
    }
}
