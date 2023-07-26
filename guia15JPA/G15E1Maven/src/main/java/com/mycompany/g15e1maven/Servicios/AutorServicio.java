/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g15e1maven.Servicios;

import com.mycompany.g15e1maven.Entidades.Autor;
import com.mycompany.g15e1maven.Persistencia.AutorDao;

import java.util.Locale;
import java.util.Scanner;
import java.sql.SQLException;
import org.eclipse.persistence.exceptions.EclipseLinkException;

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
    
    public void crearAutor (){
        try {
            System.out.println("Por favor ingrese el número de identificación del autor, seguido del nombre del autor.");
            Autor author = new Autor(INPUT.nextInt(), INPUT.next());
            daoAutor.guardar(author);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(EclipseLinkException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}