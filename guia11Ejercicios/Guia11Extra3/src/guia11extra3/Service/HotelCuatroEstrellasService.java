/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Service;

import guia11extra3.Entidad.HotelCuatroEstrellas;
import guia11extra3.Utilidades.IOUtilities;

/**
 *
 * @author diego
 */
public class HotelCuatroEstrellasService {

    public HotelCuatroEstrellas crearHotelCuatroEstrellas() {
        System.out.println("""
                           Proceso de creación de un hotel 4 estrellas.
                           
                           Por favor ingrese la siguiente información:
                           
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
        return new HotelCuatroEstrellas(IOUtilities.input.next().charAt(0), IOUtilities.input.next(),
                IOUtilities.input.nextInt(), IOUtilities.input.nextInt(), IOUtilities.input.nextInt(),
                IOUtilities.input.nextInt(), 0d, IOUtilities.input.next(), IOUtilities.input.next(), IOUtilities.input.next(), new GerenteService().crearGerente());
    }
    
    public void printData(HotelCuatroEstrellas fourStars){
        System.out.println(fourStars.toString());
    }
}
