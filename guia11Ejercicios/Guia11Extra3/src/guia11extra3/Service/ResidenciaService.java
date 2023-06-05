/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Service;

import guia11extra3.Entidad.Residencia;
import guia11extra3.Utilidades.IOUtilities;

/**
 *
 * @author diego
 */
public class ResidenciaService {

    public Residencia crearResidencia(){
        System.out.println("""
                           Proceso de registro de una residencia
                           
                           Por favor ingrese la siguiente información:
                           
                           - Cantidad total de habitaciones
                           - ¿Aplica descuento a gremios? true (sí) | false (no)
                           - ¿Tiene campo deportivo? true (sí) | false (no)
                           - ¿Es privado? true (sí) | false (no)
                           - Área total del alojamiento
                           - Nombre del alojamiento
                           - Dirección del alojamiento
                           - Localidad del alojamiento
                           - Datos del gerente:
                           """);
        return new Residencia(IOUtilities.input.nextInt(), IOUtilities.input.nextBoolean(), IOUtilities.input.nextBoolean(), IOUtilities.input.nextBoolean(),
                IOUtilities.input.nextDouble(), 0d, IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.next(), new GerenteService().crearGerente());
    }
}
