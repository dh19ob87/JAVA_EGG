/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer7;
import java.util.ArrayList;
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
        int cuentaImcDebajo = 0;
        int cuentaImcIdeal = 0;
        int cuentaImcSobrepeso = 0;
        int cuentaMayorEdad = 0;
        int cuentaMenorEdad = 0;
        ArrayList<Persona> people = new ArrayList<>();
        PersonaServicio ps = new PersonaServicio();
        people.add(ps.crearPersona());
        people.add(ps.crearPersona());
        people.add(ps.crearPersona());
        people.add(ps.crearPersona());
        
        for(Persona person : people){
            if(person.getEdad() > 18){
                cuentaMayorEdad ++;
            }else{
                cuentaMenorEdad ++;
            }
            
            switch(ps.calcularIMC(person)){
                case -1:
                    cuentaImcDebajo ++;
                    break;
                case 0:
                    cuentaImcIdeal ++;
                    break;
                case 1:
                    cuentaImcSobrepeso ++;
                    break;
            }
        }
        
        System.out.printf("Porcentaje mayores de edad: %d %% \n Porcentaje menores de edad: %d %% \n Porcentaje bajo peso: %d %% \n Porcentaje peso ideal: %d %% \n Porcentaje sobrepeso: %d %% \n", (cuentaMayorEdad * 100 / people.size()), (cuentaMenorEdad * 100 / people.size()), (cuentaImcDebajo * 100 / people.size()), (cuentaImcIdeal * 100 / people.size()), (cuentaImcSobrepeso * 100 / people.size()));
        
        people.forEach((person) -> {
            System.out.println(person.toString());
        });
    }
    
}
