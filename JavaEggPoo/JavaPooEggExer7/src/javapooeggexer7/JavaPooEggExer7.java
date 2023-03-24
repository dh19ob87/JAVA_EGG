/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer7;
import javapooeggexer7.Entidad.Persona;
import javapooeggexer7.Servicio.PersonaServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio ps = new PersonaServicio();
        Persona people = ps.crearPersona();
        if(people == null){
            System.out.println("Ocurrió un error en la creación del usuario. Por favor verifique que la información ingresada sea correcta.");
        }else{
            
        }
    }
    
}
