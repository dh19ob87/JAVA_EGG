/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer1.Entidad;

import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Libro {
    
    private int isbn;
    private String title;
    private String author;
    private int numeroPaginas;
    
    public Libro(){
    
    }
    
    public Libro(int isbn, String title, String author, int numeroPaginas){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.numeroPaginas = numeroPaginas;
    }
    
    /**
     * 
     * @param isbn 
     */
    
    public void setIsbn (int isbn){
        this.isbn = isbn;
    }
    
    /**
     * 
     * @param title 
     */
    
    public void setTitle (String title){
        this.title = title;
    }
    
    /**
     * 
     * @param author 
     */
    
    public void setAuthor (String author){
        this.author = author;
    }
    
    /**
     * 
     * @param numeroPaginas 
     */
    
    public void setNumeroPaginas (int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    
    /**
     * 
     * @return isbn
     */
    
    public int getIsbn (){
        return isbn;
    }
    
    /**
     * 
     * @return title
     */
    
    public String getTitle (){
        return title;
    }
    
    /**
     * 
     * @return author
     */
    
    public String getAuthor (){
        return author;
    }
    
    /**
     * 
     * @return numeroPaginas
     */
    
    public int getNumeroPaginas (){
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", numeroPaginas=" + numeroPaginas + '}';
    }
}
