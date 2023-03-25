/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra42;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class JavaEggExerExtra42 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        double [] notas = new double[10];
        float practicoA, practicoB, integradorA, integradorB;
        int alumnos_aprobados, alumnos_desaprobados;
        alumnos_aprobados = alumnos_desaprobados = 0;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i+1));
            System.out.println("Por favor ingrese la nota del primer trabajo práctico:");
            practicoA = Integer.parseInt(CONSOLE.readLine());
            System.out.println("Por favor ingrese la nota del segundo trabajo práctico");
            practicoB = Integer.parseInt(CONSOLE.readLine());
            System.out.println("Por favor ingrese la nota del primer integrador");
            integradorA = Integer.parseInt(CONSOLE.readLine());
            System.out.println("Por favort ingrese la nota del segundo integrador");
            integradorB = Integer.parseInt(CONSOLE.readLine());
            
            notas[i] = (practicoA * 0.1) + (practicoB * 0.15) + (integradorA * 0.25) + (integradorB * 0.5);
            
            if(notas[i] >= 7){
                alumnos_aprobados ++;
            }else{
                alumnos_desaprobados++;
            }
        }
        
        System.out.printf("Alumnos aprobados: %d | Alumnos desaprobados: %d. \n", alumnos_aprobados, alumnos_desaprobados);
    }
    
}
