/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Entidad;

import java.util.LinkedList;
import java.util.Objects;
/**
 *
 * @author diego
 */
public class Simulador {
    private LinkedList<Voto> votaciones;

    public Simulador() {
    }

    public Simulador(LinkedList<Voto> votaciones) {
        this.votaciones = votaciones;
    }

    public LinkedList<Voto> getVotaciones() {
        return votaciones;
    }

    public void setVotaciones(LinkedList<Voto> votaciones) {
        this.votaciones = votaciones;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.votaciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Simulador other = (Simulador) obj;
        return Objects.equals(this.votaciones, other.votaciones);
    }

    @Override
    public String toString() {
        return "Simulador{" + "votaciones=" + votaciones + '}';
    }
}
