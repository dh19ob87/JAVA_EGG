/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra2.Entidad;

import guia10extra2.Enumerable.LetrasAsiento;
/**
 *
 * @author diego
 */
public class Asiento {
    private int idAsiento;
    private LetrasAsiento letra;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(int idAsiento, LetrasAsiento letra, boolean ocupado) {
        this.idAsiento = idAsiento;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public LetrasAsiento getLetra() {
        return letra;
    }

    public void setLetra(LetrasAsiento letra) {
        this.letra = letra;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "idAsiento=" + idAsiento + ", letra=" + letra + ", ocupado=" + ocupado + '}';
    }
    
    
}
