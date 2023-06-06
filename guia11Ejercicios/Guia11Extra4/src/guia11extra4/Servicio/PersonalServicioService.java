/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Servicio;

import guia11extra4.Entidad.PersonalServicio;
import guia11extra4.Enumerables.EstadoCivil;
import guia11extra4.Enumerables.Seccion;
import guia11extra4.Utilidades.IOUtilities;
import java.util.Arrays;
import java.util.function.Consumer;
import java.time.Year;

/**
 *
 * @author diego
 */
public class PersonalServicioService {
    
    public PersonalServicio crearPersonalServicio(){
        System.out.println("""
                           Proceso de creación de personal de servicio.
                           
                           Por favor ingrese los siguientes datos:
                           
                           - Sección asignada
                           - Año de incorporación
                           - Número de despacho
                           - Nombres
                           - Apellidos
                           - DNI
                           - Estado Civil
                           """);
        
        Consumer<EstadoCivil []> printEstadoCivil = (estado) -> System.out.println(Arrays.toString(estado));
        Consumer<Seccion []> printSecciones = (seccion) -> System.out.println(Arrays.toString(seccion));
        
        printEstadoCivil.accept(EstadoCivil.values());
        printSecciones.accept(Seccion.values());
        
        return new PersonalServicio(Seccion.valueOf(IOUtilities.input.next()), Year.of(IOUtilities.input.nextInt()), IOUtilities.input.nextInt(), IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.nextLong(), EstadoCivil.valueOf(IOUtilities.input.next()));
    }
    
}
