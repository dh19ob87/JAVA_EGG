/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Utilidades;

import java.util.Comparator;
import guia11extra3.Entidad.Alojamiento;

/**
 *
 * @author diego
 */
public class Comparadores{
    public static Comparator<Alojamiento>  ordenarPorPrecioDescendente = (alojamiento1, alojamiento2) -> (alojamiento1.getDireccion().compareTo(alojamiento2.getDireccion()));
}
