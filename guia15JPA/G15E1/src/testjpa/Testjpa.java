/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testjpa;

import testjpa.Servicios.AutorServicio;

/**
 *
 * @author diego
 */
public class Testjpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        AutorServicio servicioAutor = new AutorServicio();
        try {
            servicioAutor.crearAutor();
        } catch (Exception e) {
            throw e;
        }
    }
}
