/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer1.Utilidades;

import java.util.Comparator;

/**
 *
 * @author diego
 */
public class Comparadores {
    /**
     * 
     */
    public static Comparator <String> ordenarRazasDescendente = (String pet1, String pet2) -> pet2.compareTo(pet1);
    
    public static Comparator <String> ordenarRazasAscendente = new Comparator <String> (){
        @Override
        public int compare(String pet1, String pet2){
            return pet1.compareTo(pet2);
        }
    };
}
