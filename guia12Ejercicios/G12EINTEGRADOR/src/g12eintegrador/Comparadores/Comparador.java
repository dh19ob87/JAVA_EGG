/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Comparadores;

import java.util.Comparator;
import g12eintegrador.Entidad.Fani;

/**
 *
 * @author diego
 */
public class Comparador {
    public static Comparator <Fani> ordenarFanisPorDistanciaAsc = (Fani f1, Fani f2) -> Integer.valueOf((int) (Math.sqrt((Math.pow(f1.getX(), 2) + Math.pow(f1.getY(), 2) + Math.pow(f1.getZ(), 2))))).compareTo(Integer.valueOf((int) (Math.sqrt((Math.pow(f2.getX(), 2) + Math.pow(f2.getY(), 2) + Math.pow(f2.getZ(), 2))))));
}
