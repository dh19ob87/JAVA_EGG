/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11extra3;

import guia11extra3.Entidad.Alojamiento;
import guia11extra3.Entidad.Camping;
import guia11extra3.Entidad.Extrahotelero;
import guia11extra3.Entidad.Gerente;
import guia11extra3.Entidad.Hotel;
import guia11extra3.Entidad.HotelCincoEstrellas;
import guia11extra3.Entidad.Residencia;
import guia11extra3.Entidad.HotelCuatroEstrellas;
import guia11extra3.Entidad.HotelCuatroEstrellas;
import guia11extra3.Service.CampingService;
import guia11extra3.Service.ResidenciaService;
import guia11extra3.Service.HotelCuatroEstrellasService;
import guia11extra3.Service.HotelCincoEstrellasService;
import guia11extra3.Utilidades.Comparadores;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author diego
 */
public class Guia11Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Alojamiento> alojamientos = new LinkedHashSet<>();
        alojamientos.add(new Camping(10, 5, true, false, 100d, 0d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, 0d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, 0d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, 0d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, 0d, "Yaguara", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, 0d, "Manantial", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, 0d, "Sheraton", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, 0d, "Horus", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, 0d, "Manantial", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, 0d, "Manantial", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCOA", 30, 100, 2000, 10, 0d, "Alan hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCOB", 30, 1000, 100, 10, 0d, "AlanA hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCOC", 30, 500, 500, 10, 0d, "AlanB hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCO", 30, 1500, 5200, 10, 0d, "AlanC hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCincoEstrellas(10, 15, 20, 'B', "Agua", 100, 300, 500, 20, 0d, "Karla hotel", "123456", "Paris", new Gerente("Prisma", 987l)));
        alojamientos.add(new HotelCincoEstrellas(10, 15, 20, 'B', "Agua", 100, 300, 500, 20, 0d, "Karma hotel", "123456", "Paris", new Gerente("Prisma", 987l)));
        alojamientos.add(new HotelCincoEstrellas(10, 15, 20, 'B', "Agua", 100, 300, 500, 20, 0d, "Karmalo hotel", "123456", "Paris", new Gerente("Prisma", 987l)));
        
        System.out.println("<<<<<LISTADO DE TODOS LOS ALOJAMIENTOS>>>>>\n\n");
        alojamientos.forEach(System.out::println);
        System.out.println("\n\n<<<<<LISTADO DE TODOS LOS ALOJAMIENTOS POR PRECIO DESCENDENTE>>>>>\n\n");
        alojamientos.stream().filter(alojamiento -> (alojamiento instanceof Hotel)).map(alojamiento -> ((Hotel) alojamiento)).peek(Hotel::precioHabitacion).sorted(Comparadores.ordenarPorPrecioDescendente.reversed()).forEach(System.out::println);
        System.out.println("\n\n<<<<<LISTADO DE ALOJAMIENTOS EXTRAHOTELEROS>>>>>\n\n");
        alojamientos.stream().filter(alojamiento -> (alojamiento instanceof Extrahotelero)).map(alojamiento -> (Extrahotelero) alojamiento).peek(Extrahotelero::precioEstadia).forEach(System.out::println);
        System.out.println("\n\n<<<<<LISTADO DE CAMPINGS CON RESTAURANTE>>>>>\n\n");
        alojamientos.stream().filter(alojamiento -> (alojamiento instanceof Camping)).map(alojamiento -> ((Camping) alojamiento)).filter(camping -> camping.getRestaurante()).forEach(System.out::println);
        System.out.println("\n\n<<<<<LISTADO DE RESIDENCIAS CON DESCUENTO>>>>>\n\n");
        alojamientos.stream().filter(alojamiento -> (alojamiento instanceof Residencia)).map(alojamiento -> ((Residencia) alojamiento)).filter(residencia -> residencia.getDescuentoAGremios()).forEach(System.out::println);
    }

}
