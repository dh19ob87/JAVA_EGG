/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Utilidades;

import java.util.Comparator;
import guia10extra3.Entidad.Poliza;
/**
 *
 * @author diego
 */
public class Comparadores {
    public static Comparator <Poliza> ordenarPolizaPorPropietarioAsc = (Poliza p1, Poliza p2) -> p1.getAcreedor().getDni().compareTo(p2.getAcreedor().getDni());
    public static Comparator <Poliza> ordenarPolizaPorPropietarioDesc = (Poliza p1, Poliza p2) -> p2.getAcreedor().getDni().compareTo(p1.getAcreedor().getDni());
}
