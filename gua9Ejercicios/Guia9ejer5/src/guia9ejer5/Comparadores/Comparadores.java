/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer5.Comparadores;

import guia9ejer5.Entidad.Country;
import java.util.Comparator;

/**
 *
 * @author diego
 */
public class Comparadores {
    
    /**
     * Defino los comparadores porque los Sets al ser creados pueden recibir un Comparator para definir el atributo del objeto por el cual será ordenado.
     * De modo que siempre que desees ordenar el Set, debes crear un nuevo Set 
     */    
    public static Comparator <Country> ordenarPorNombrePaisAsc = (Country paisA, Country paisB) -> paisA.getPais().compareTo(paisB.getPais());
    public static Comparator <Country> ordenarPorNombrePaisDesc = (Country paisA, Country paisB) -> paisB.getPais().compareTo(paisA.getPais());
}
