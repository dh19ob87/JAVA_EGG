/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Servicio;

import guia10extra4.Entidad.Voto;
import guia10extra4.Entidad.Alumno;
import java.util.LinkedList;
/**
 *
 * @author diego
 */
public class VotoServicio {
    public Voto crearVoto (Alumno estudiante){
        return new Voto(estudiante, new LinkedList<>());
    }
    
    public void imprimirVoto (Voto vote){
        System.out.printf("Votante: %s %s | votos obtenidos %d\n", vote.getStudent().getApeliido(), vote.getStudent().getNombre(), vote.getStudent().getVotosObtenidos());
        System.out.println("Votos dados:");
        vote.getVotosOtorgados().forEach(System.out::println);
    }
}
