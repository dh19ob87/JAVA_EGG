/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer9;
import javapooeggexer9.Entidad.Matematica;
import javapooeggexer9.Servicio.MatematicaServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematicaServicio ms = new MatematicaServicio();
        Matematica math = ms.crearMatematica();
        Matematica maths = ms.crearMatematicaSetters();
        ms.printMatematica(math);
        System.out.println(ms.devolverMayor(math));
        System.out.println(ms.calcularPotencia(math));
        System.out.println(ms.calcularRaiz(math));
        ms.printMatematica(maths);
        System.out.println(ms.devolverMayor(maths));
        System.out.println(ms.calcularPotencia(maths));
        System.out.println(ms.calcularRaiz(maths));
    }
    
}
