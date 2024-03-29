/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra6.Servicio;

import java.util.ArrayList;
import java.util.Arrays;
import javapooeggexerextra6.Entidad.Ahorcado;
import javapooeggexerextra6.Entidad.Pantalla;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class AhorcadoServicio {

    public Ahorcado crearJuego() {
        Map<Integer, String> palabras;
        palabras = new HashMap<>();
        palabras.put(1, "Serendipia");
        palabras.put(2, "Onirico");
        palabras.put(3, "Experiencia");
        palabras.put(4, "Programacion");
        palabras.put(5, "Adivinanza");
        palabras.put(6, "Compras");
        palabras.put(7, "Caligrafia");
        palabras.put(8, "Xenofobia");
        palabras.put(9, "Inextricable");
        palabras.put(10, "Shuumatsu");
        palabras.put(11, "Sanar");
        palabras.put(12, "Sumergir");
        palabras.put(13, "Paz");
        palabras.put(14, "Cooperacion");
        palabras.put(15, "Extraño");
        palabras.put(16, "Tilde");
        palabras.put(17, "Samurai");
        palabras.put(18, "x");
        palabras.put(19, "Increible");
        palabras.put(20, "Nefelibata");
        int palabraAleatoria = (int) (Math.random() * 21);
        System.out.println("Ingrese la cantidad de intentos que quiere realizar.");
        return new Ahorcado(palabras.get(palabraAleatoria).toLowerCase().split(""), 0, new Scanner(System.in).useDelimiter("\n").nextInt());
    }

    public void setLetrasFaltantes(Ahorcado hangman) {
        ArrayList<String> letrasFaltantes = new ArrayList<>();
        letrasFaltantes.addAll(Arrays.asList(hangman.getPalabraABuscar()));
        hangman.setLetrasFaltantes(letrasFaltantes);
    }

    public void longitud(Ahorcado hangman) {
        System.out.println("Caracteres de la palabra: " + hangman.getPalabraABuscar().length);
    }

    public void buscar(Ahorcado hangman, String letra) {
        if (Arrays.toString(hangman.getPalabraABuscar()).contains(letra)) {
            hangman.setLetrasEncontradas(hangman.getLetrasEncontradas() + 1);
            hangman.getLetrasFaltantes().removeIf((caracter) -> (caracter.equals(letra)));
        }
        encontradas(hangman, String.valueOf(letra));
        System.out.printf("¿La letra, %s, se encuentra en la palabra? %b \n", letra, (Arrays.toString(hangman.getPalabraABuscar()).contains(letra)));
    }

    public boolean encontradas(Ahorcado hangman, String letra) {
        boolean encontrado = false;
        for (String elemento : hangman.getPalabraABuscar()) {
            if (elemento.equalsIgnoreCase(letra)) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            hangman.setIntentosUsados(hangman.getIntentosUsados() + 1);
        }

        System.out.println("Letras encontradas: " + hangman.getLetrasEncontradas() + " Letras faltantes: " + (hangman.getPalabraABuscar().length - hangman.getLetrasEncontradas()));

        return encontrado;
    }

    public void intentos(Ahorcado hangman) {
        System.out.printf("Te quedan %d intentos.\n", (hangman.getCantidadJugadasMaximas() - hangman.getIntentosUsados()));
    }

    public void juego() {
        Ahorcado hangman = crearJuego();
        PantallaServicio ps = new PantallaServicio();
        Pantalla screen = ps.crearPantalla(Arrays.toString(hangman.getPalabraABuscar()));
        setLetrasFaltantes(hangman);
        do {
            System.out.println("=========================================================");
            ps.printPalabraAhorcado(screen, hangman);
            longitud(hangman);
            intentos(hangman);
            System.out.println("Por favor ingrese una letra a buscar:");
            buscar(hangman, String.valueOf(new Scanner(System.in).useDelimiter("\n").next().charAt(0)));
        } while (hangman.getIntentosUsados() < hangman.getCantidadJugadasMaximas() && !hangman.getLetrasFaltantes().isEmpty());
        
        System.out.println("=========================================================");
        
        if (hangman.getLetrasFaltantes().isEmpty()) {
            System.out.println("Juego terminado. Ganaste.");
        } else if (hangman.getIntentosUsados() - hangman.getCantidadJugadasMaximas() == 0) {
            System.out.println("Intentos agotados. Perdiste. La palabra era: " + Arrays.toString(hangman.getPalabraABuscar()));
        }
    }
}
