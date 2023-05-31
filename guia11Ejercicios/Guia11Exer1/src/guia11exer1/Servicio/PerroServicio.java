/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Servicio;

import guia11exer1.Entidad.Perro;
import guia11exer1.Enumerables.RazaPerros;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class PerroServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Perro crearPerro(){
        System.out.println("Por favor ingrese el nombre, alimento, edad y raza del perro");
        return new Perro(INPUT.next(), INPUT.next(), INPUT.nextInt(), RazaPerros.COCKER);
    }
    
    public void sonar(Perro dog){
        dog.sonidoAnimal();
    }
}
