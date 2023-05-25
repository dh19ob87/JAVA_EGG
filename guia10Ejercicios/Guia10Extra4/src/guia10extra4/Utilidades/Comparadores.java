/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Utilidades;

import java.util.Comparator;
import guia10extra4.Entidad.Voto;
/**
 *
 * @author diego
 */
public class Comparadores {
    public static Comparator <Voto> ordenarEleccionesDesc = (Voto vote1, Voto vote2) -> vote1.getStudent().getVotosObtenidos().compareTo(vote2.getStudent().getVotosObtenidos());
    public static Comparator <Voto> ordenarEleccionesAsc = (Voto vote1, Voto vote2) -> vote2.getStudent().getVotosObtenidos().compareTo(vote1.getStudent().getVotosObtenidos());
}
