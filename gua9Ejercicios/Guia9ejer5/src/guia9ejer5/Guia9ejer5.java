/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer5;

import guia9ejer5.Entidad.Country;
import guia9ejer5.Servicio.CountryService;
import java.util.Set;

/**
 *
 * @author diego
 */
public class Guia9ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CountryService cs = new CountryService();
        Set <Country> countries = cs.crearPaises();
        cs.menu(countries);
    }
    
}
