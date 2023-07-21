/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g15e1maven;

import com.mycompany.g15e1maven.Servicios.AutorServicio;

/**
 *
 * @author diego
 */
public class G15E1Maven {

    public static void main(String[] args) throws Exception {
        AutorServicio servicioAutor = new AutorServicio();
        try {
            servicioAutor.crearAutor();
        } catch (Exception e) {
            throw e;
        }
    }
}
