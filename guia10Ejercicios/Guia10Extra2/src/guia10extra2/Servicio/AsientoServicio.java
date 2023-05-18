/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Servicio;

import guia10extra2.Entidad.Asiento;
import guia10extra2.Enumerable.LetrasAsiento;
/**
 *
 * @author diego
 */
public class AsientoServicio {
    public Asiento crearAsiento (int id, LetrasAsiento letra){
        return new Asiento(id, letra, false);
    }
    
    public void imprimirDatosAsiento (Asiento puesto){
        System.out.println(puesto.toString());
    }
}
