/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Servicio;

import g12eintegrador.Entidad.Fani;
import g12eintegrador.Enumerables.TipoMovimiento;
import g12eintegrador.Interfaces.CoordenadasEsfericas;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

/**
 * Un FANI tiene como máximo un rango de alcance de 3 KM
 *
 * @author diego
 */
public class FaniServicio implements CoordenadasEsfericas{

    public Fani crearFani() {
        Random rand = new Random();
        
        TipoMovimiento tipoFani = TipoMovimiento.values()[rand.nextInt(2)];
        int [] coordenadasCartesianas = convertirCoordenadasEsfericasACartesianas((tipoFani.toString().equalsIgnoreCase("movil")));

        return new Fani(tipoFani, new Random().nextBoolean(), 100, rand.nextInt(11), rand.nextInt(4), rand.nextInt(101), coordenadasCartesianas[0], coordenadasCartesianas[1], coordenadasCartesianas[2]);
    }

    public List<Fani> crearListaDeFanis() {
        Random rand = new Random();
        List <Fani> listaDeFanis = new LinkedList<>();
        
        for (int i = 0; i < (rand.nextInt(90)+10); i++) {
            listaDeFanis.add(crearFani());
        }
        
        return listaDeFanis;
    }
    
    //Definir una longitud de \rho
    //si es estático entonces el ángulo \theta debe ser calculado en el rango de \pi 2*\pi
    //Si es móvil entonces ademas de \theta se calcula \varphhi en el rango de \pi
    
    @Override
    public int[] convertirCoordenadasEsfericasACartesianas(boolean isMovil){
        Random rand = new Random();
        int [] coordenadasCartesianas = new int [3];
        
        int rho = rand.nextInt(11) + 1;
        int theta = (int) (Math.toRadians(rand.nextInt(360)));
        int varphi = (isMovil) ? (int) (Math.toRadians(rand.nextInt(180))) : 0;
        
        coordenadasCartesianas[0] = (int) (rho * Math.sin(varphi) * Math.cos(theta));
        coordenadasCartesianas[1] = (int) (rho * Math.sin(varphi) * Math.sin(theta));
        coordenadasCartesianas[2] = (int) (rho * Math.cos(varphi));
        
        return coordenadasCartesianas;
    }
}
