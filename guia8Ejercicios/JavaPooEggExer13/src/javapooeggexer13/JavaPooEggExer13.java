/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer13;
import javapooeggexer13.Entidad.Curso;
import javapooeggexer13.Servicio.CursoServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoServicio cs = new CursoServicio();
        Curso course = cs.crearCurso();
        cs.calcularGananciaSemanal(course);
        cs.mostrarDataCourse(course);
    }
    
}
