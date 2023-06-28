/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Servicio;

import g12eintegrador.Entidad.Parte;
import g12eintegrador.Enumerables.TipoParte;

/**
 *
 * @author diego
 */
public class ParteServicio {
    
    public Parte crearParte(float consumoMinimo, TipoParte parteArmadura){
        return new Parte(true, consumoMinimo, parteArmadura);
    }
    
    public void printDataParte(Parte parteArmadura){
        System.out.println(parteArmadura.toString());
    }
}
