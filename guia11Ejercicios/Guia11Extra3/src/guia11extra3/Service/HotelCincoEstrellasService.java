/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Service;

import guia11extra3.Entidad.HotelCincoEstrellas;
import guia11extra3.Utilidades.IOUtilities;

/**
 *
 * @author diego
 */
public class HotelCincoEstrellasService {

    public HotelCincoEstrellas crearHotelCincoEstrellas (){
        System.out.println("""
                           Proceso de creación de hotel 5 estrellas.

                           Por favor ingrese la siguiente información:
                           
                           - Cantidad de Salones de conferencia
                           - Cantidad de suites
                           - Cantidad de limusinas
                           - Categoría del gimnasio: A | B
                           - Nombre del restaurante
                           - Capacidad del restaurante
                           - Cantidad de habitaciones
                           - Cantidad de camas
                           - Cantidad de pisos
                           - Nombre del alojamiento
                           - Dirección del alojamiento
                           - Localidad del alojamiento
                           - Datos del gerente:
                           
                           """);
        return new HotelCincoEstrellas(IOUtilities.input.nextInt(), IOUtilities.input.nextInt(), IOUtilities.input.nextInt(),
                IOUtilities.input.next().charAt(0), IOUtilities.input.next(), IOUtilities.input.nextInt(), IOUtilities.input.nextInt(),
                IOUtilities.input.nextInt(),IOUtilities.input.nextInt(), 0d, IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.next(), new GerenteService().crearGerente());
    }
    
    public void printData(HotelCincoEstrellas fiveStars){
        System.out.println(fiveStars);
    }
}
