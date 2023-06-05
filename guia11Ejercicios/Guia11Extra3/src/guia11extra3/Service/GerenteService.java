/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Service;

import guia11extra3.Entidad.Gerente;
import guia11extra3.Utilidades.IOUtilities;
/**
 *
 * @author diego
 */
public class GerenteService {
    
    public Gerente crearGerente(){
        System.out.println("Por favor ingrese el nombre y dni del gerente");
        return new Gerente(IOUtilities.input.next(), IOUtilities.input.nextLong());
    }
    
    public void printData(Gerente manager){
        System.out.println(manager.toString());
    }
}
