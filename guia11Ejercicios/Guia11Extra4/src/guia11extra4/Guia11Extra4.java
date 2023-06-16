/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11extra4;

import guia11extra4.Entidad.Estudiante;
import guia11extra4.Entidad.Persona;
import guia11extra4.Enumerables.EstadoCivil;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class Guia11Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> people = new LinkedList<>();
        people.add(new Estudiante(new ArrayList<String>(), "A", "B", 1234l, EstadoCivil.CASADO));
        people.add(new Estudiante(new ArrayList<String>(), "A", "B", 1234l, EstadoCivil.CASADO));
    }

}
