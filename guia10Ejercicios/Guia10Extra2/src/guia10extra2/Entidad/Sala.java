/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Entidad;

import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class Sala {
    private int idSala;
    private String nombreSala;
    private ArrayList<ArrayList <Asiento>> puestos;
    private ArrayList <Espectador> personasEnSala;

    public Sala() {
    }

    public Sala(int idSala, String nombreSala, ArrayList<ArrayList<Asiento>> puestos, ArrayList <Espectador> personasEnSala) {
        this.idSala = idSala;
        this.nombreSala = nombreSala;
        this.puestos = puestos;
        this.personasEnSala = personasEnSala;
    }

    public ArrayList<Espectador> getPersonasEnSala() {
        return personasEnSala;
    }

    public void setPersonasEnSala(ArrayList<Espectador> personasEnSala) {
        this.personasEnSala = personasEnSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public ArrayList<ArrayList<Asiento>> getPuestos() {
        return puestos;
    }

    public void setPuestos(ArrayList<ArrayList<Asiento>> puestos) {
        this.puestos = puestos;
    }

    @Override
    public String toString() {
        return "Sala{" + "idSala=" + idSala + ", nombreSala=" + nombreSala + ", puestos=" + puestos + ", personasEnSala=" + personasEnSala + '}';
    }
}
