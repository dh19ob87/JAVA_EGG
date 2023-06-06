/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Servicio;

import guia11extra4.Entidad.Profesor;
import guia11extra4.Enumerables.Departamento;
import guia11extra4.Enumerables.EstadoCivil;
import guia11extra4.Utilidades.IOUtilities;
import java.util.function.Consumer;
import java.time.Year;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class ProfesorServicio{

    public Profesor crearProfesor() {
        System.out.println("""
                           Proceso de registro de profesor. Por favor ingrese la siguiente información:
                           
                           - Año de incorporación.
                           - Número de despacho.
                           - Nombres
                           - Apellidos
                           - DNI
                           - Estado civil
                           """);
        Consumer<EstadoCivil []> printEstadoCivil = (estado) -> System.out.println(Arrays.toString(estado));
        Consumer <Departamento []> printDepartments = (dpto) -> System.out.println(Arrays.toString(dpto));
        
        printEstadoCivil.accept(EstadoCivil.values());
        printDepartments.accept(Departamento.values());
        
        return new Profesor(Departamento.valueOf(IOUtilities.input.next()),Year.of( IOUtilities.input.nextInt()),
                IOUtilities.input.nextInt(), IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.nextLong(), EstadoCivil.valueOf(IOUtilities.input.next()));
    }
    
   public void printData (Profesor teacher){
       System.out.println(teacher.toString());
   }
}
