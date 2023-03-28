/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra1.Entidad;

/**
 *
 * @author diego
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion (){}
    
    public Cancion (String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public void setTitle (String titulo){
        this.titulo = titulo;
    }
    
    public void setAuthor (String autor){
        this.autor = autor;
    }
    
    public String getAuthor (){
        return autor;
    }
    
    public String getTitle (){
        return titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
}
