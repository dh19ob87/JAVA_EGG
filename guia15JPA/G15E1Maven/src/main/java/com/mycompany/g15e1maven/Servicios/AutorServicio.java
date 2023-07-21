/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g15e1maven.Servicios;

import com.mycompany.g15e1maven.Entidades.Autor;
import com.mycompany.g15e1maven.Persistencia.AutorDao;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class AutorServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private final AutorDao daoAutor;
    private LibroServicio servicioLibro;
    private EditorialServicio servicioEditorial;
    
    public AutorServicio (){
        this.daoAutor = new AutorDao();
    }
    
    public void setServicios (LibroServicio servicioLibro, EditorialServicio servicioEditorial){
        this.servicioLibro = servicioLibro;
        this.servicioEditorial = servicioEditorial;
    }
    
    public void crearAutor () throws Exception{
        try {
            System.out.println("Por favor ingrese el nombre del autor.");
            Autor author = new Autor(0, INPUT.next(), true);
            daoAutor.guardar(author);
        } catch (Exception e) {
            throw e;
        }
    }
}