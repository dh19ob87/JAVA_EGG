/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Servicio;

import g12eintegrador.Entidad.Armadura;
import g12eintegrador.Entidad.Parte;
import java.util.LinkedList;
import java.util.Random;
import g12eintegrador.Enumerables.Color;
import g12eintegrador.Enumerables.TipoParte;

/**
 *
 * @author diego
 */
public class ArmaduraServicio {

    public Armadura crearArmadura() {
        ParteServicio partesServicio = new ParteServicio();
        LinkedList<Parte> armadura = new LinkedList<>();
        
        for (TipoParte parte : TipoParte.values()) {
            armadura.add(partesServicio.crearParte((parte.toString().toLowerCase().contains("guante")) ? 20 : (parte.toString().toLowerCase().contains("bota")) ? 10 : (parte.toString().equalsIgnoreCase("reactor")) ? 30 : 5, parte));
        }
        
        return new Armadura(Color.values()[new Random().nextInt(Color.values().length)], Color.values()[new Random().nextInt(Color.values().length)], armadura, Integer.MAX_VALUE, 5, 5, 30, 0, 0, 0);
    }
    
    public void printDataArmadura(Armadura ironman){
        System.out.println(ironman.toString());
    }
}
