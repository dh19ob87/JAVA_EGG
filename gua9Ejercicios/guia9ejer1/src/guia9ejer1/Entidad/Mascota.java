/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer1.Entidad;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author diego
 */
public class Mascota {

    private ArrayList<String> razas = new ArrayList();

    public Mascota() {
    }

    public Mascota(ArrayList<String> razas) {
        this.razas = razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void addRaza(String raza) {
        this.razas.add(raza);
    }

    public String getRaza(int index) {
        return razas.get(index);
    }

    public int getFirstIndexRaza(String raza) {
        return razas.indexOf(raza);
    }

    public void removeRaza(String raza) {
        razas.remove(raza);
    }

    public void removerPosicion(int index) {
        razas.remove(index);
    }

    public void ordenarRazas() {
        Collections.sort(razas);
    }
    
    public void ordenarReverseRazas(){
        Collections.sort(razas, Collections.reverseOrder());
    }

    @Override
    public String toString() {
        return "Mascota{" + "razas=" + razas + '}';
    }

}
