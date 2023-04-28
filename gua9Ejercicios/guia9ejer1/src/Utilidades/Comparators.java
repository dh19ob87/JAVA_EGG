/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import guia9ejer1.Entidad.Mascota;
import java.util.Comparator;

/**
 *
 * @author diego
 */
public class Comparators {
    
    public static Comparator <String> ordenarRazasDescendente = new Comparator <String> (){
        @Override
        public int compare(String pet1, String pet2){
            return pet1.compareTo(pet2);
        }
    };
}
