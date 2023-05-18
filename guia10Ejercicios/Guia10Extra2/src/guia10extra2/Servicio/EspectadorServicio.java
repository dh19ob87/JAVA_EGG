/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Servicio;

import java.util.Scanner;
import guia10extra2.Entidad.Espectador;
import guia10extra2.Enumerable.LetrasAsiento;
import java.util.Locale;
/*
 * @author diego
 */
public class EspectadorServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private SalaServicio ss = new SalaServicio();
    private AsientoServicio as = new AsientoServicio();
            
    public Espectador crearEspectador(){
        System.out.println("Por favor ingrese el nombre, edad, saldo del espectador");
        return new Espectador(INPUT.next(), INPUT.nextInt(), INPUT.nextDouble());
    }
    
    private LetrasAsiento letraEnumerable() {
        String letra;
        boolean pertenece = false;
        do {
            letra = INPUT.next();
            for (LetrasAsiento elemento : LetrasAsiento.values()) {
                if (elemento.toString().equalsIgnoreCase(letra)) {
                    pertenece = true;
                }
            }
            if (!pertenece) {
                System.out.println("Las letras permitidas son:");
                for (LetrasAsiento elemento : LetrasAsiento.values()) {
                    System.out.println(elemento);
                }
            }
        } while (!pertenece);

        return LetrasAsiento.valueOf(letra.toUpperCase());
    }
    
    public void venderEntrada(Espectador cliente){
    
    }
    
    public void asignarPuesto(Espectador cliente){
        
    }
}
