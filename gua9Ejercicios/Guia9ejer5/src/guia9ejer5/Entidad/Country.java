/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer5.Entidad;

import java.util.Objects;
/**
 *
 * @author diego
 */
public class Country implements Comparable<Country>{

    private String pais;

    public Country() {
    }

    public Country(String pais) {
        this.pais = pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.pais);
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
        final Country other = (Country) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Country{" + "pais=" + pais + '}';
    }

    @Override
    public int compareTo(Country t) {
        return this.getPais().compareTo(t.getPais());
    }
}
