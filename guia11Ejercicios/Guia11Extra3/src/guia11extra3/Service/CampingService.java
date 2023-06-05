/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Service;

import guia11extra3.Entidad.Camping;
import guia11extra3.Utilidades.IOUtilities;

/**
 *
 * @author diego
 */
public class CampingService {

    public Camping crearCamping() {
        System.out.println("""
                           Proceso de registro de un Camping.
                           
                           Por favor ingrese:
                           
                           - Cantidad máxima de carpas
                           - Cantidad de baños
                           - ¿Tiene restaurante? -> true (sí) | false (no)
                           - ¿Es privado? -> true (sí) | false (no)
                           - Área del camping
                           - Nombre del alojamiento
                           - Dirección del alojamiento
                           - Localidad del alojamiento
                           - Datos del gerente:
                           """);
        return new Camping(IOUtilities.input.nextInt(), IOUtilities.input.nextInt(),
                IOUtilities.input.nextBoolean(), IOUtilities.input.nextBoolean(), IOUtilities.input.nextDouble(), 0d,
                IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.next(), new GerenteService().crearGerente());
    }
    
    public void printData(Camping camp){
        System.out.println(camp.toString());
    }
}
