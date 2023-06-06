/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Servicio;

import guia11extra4.Entidad.Estudiante;
import guia11extra4.Utilidades.IOUtilities;
import guia11extra4.Enumerables.EstadoCivil;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class EstudianteServicio {
    
    public Estudiante crearEstudiante (){
        ArrayList <String> cursos = new ArrayList<>();
        System.out.println("Por favor ingrese el nombre del curso, nombre, apellidos, DNI y estado civil del estudiante, ");
        cursos.add(IOUtilities.input.next());
        
        Consumer<EstadoCivil []> printEstadoCivil = (estado) -> System.out.println(Arrays.toString(estado));
        
        printEstadoCivil.accept(EstadoCivil.values());
        return new Estudiante(cursos, IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.nextLong(), EstadoCivil.valueOf(IOUtilities.input.next()));
    }
    
    public void printData(Estudiante alumno){
        System.out.println(alumno.toString());
    }
    
    public void agregarCurso(Estudiante alumno){
        System.out.println("Por favor ingrese el nombre del curso");
        alumno.getCursosInscritos().add(IOUtilities.input.next());
    }
}
