/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra4.Servicio;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import javapooeggexerextra4.Entidad.NIF;

/**
 *
 * @author diego
 */
public class NIFServicio {

    public NIF crearNif() {
        Map<Integer, Character> letra = new HashMap<>();
        letra.put(0, 'T');
        letra.put(1, 'R');
        letra.put(2, 'W');
        letra.put(3, 'A');
        letra.put(4, 'G');
        letra.put(5, 'M');
        letra.put(6, 'Y');
        letra.put(7, 'F');
        letra.put(8, 'P');
        letra.put(9, 'D');
        letra.put(10, 'X');
        letra.put(11, 'B');
        letra.put(12, 'N');
        letra.put(13, 'J');
        letra.put(14, 'Z');
        letra.put(15, 'S');
        letra.put(16, 'Q');
        letra.put(17, 'V');
        letra.put(18, 'H');
        letra.put(19, 'L');
        letra.put(20, 'C');
        letra.put(21, 'K');
        letra.put(22, 'E');
        letra.values();
        
        System.out.println("Por favor ingrese el código de 8 dígitos");
        long nif = new Scanner(System.in).useDelimiter("\n").nextLong();
        return new NIF(nif, letra.get((int) (nif % 23)));
    }
    
    public void mostrar(NIF code){
        System.out.println(code.getDNI() + " - " + String.valueOf(code.getLetra()).toUpperCase());
    }
}
