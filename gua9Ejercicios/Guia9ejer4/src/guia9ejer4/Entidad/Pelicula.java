/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer4.Entidad;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Integer horas;
    
    public Pelicula(){}
    
    public Pelicula (String titulo, String director, Integer horas){
        this.titulo = titulo;
        this.horas = horas;
        this.director = director;
    }
    
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    
    public void setDirector (String director){
        this.director = director;
    }
    
    public void setHoras (Integer horas){
        this.horas = horas;
    }
    
    public String getTitulo (){
        return titulo;
    }
    
    public String getDirector (){
        return director;
    }
    
    public Integer getHoras (){
        return horas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.director);
        hash = 97 * hash + Objects.hashCode(this.horas);
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
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.horas, other.horas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
}
