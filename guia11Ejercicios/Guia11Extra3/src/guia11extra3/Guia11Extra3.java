/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11extra3;

import guia11extra3.Entidad.Alojamiento;
import guia11extra3.Entidad.Camping;
import guia11extra3.Entidad.Gerente;
import guia11extra3.Entidad.HotelCincoEstrellas;
import guia11extra3.Entidad.Residencia;
import guia11extra3.Entidad.HotelCuatroEstrellas;
import guia11extra3.Entidad.HotelCuatroEstrellas;
import guia11extra3.Service.CampingService;
import guia11extra3.Service.ResidenciaService;
import guia11extra3.Service.HotelCuatroEstrellasService;
import guia11extra3.Service.HotelCincoEstrellasService;
import java.util.LinkedHashSet;
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
        LinkedHashSet<Alojamiento> alojamientos = new LinkedHashSet<>();
        
        alojamientos.add(new Camping(10, 5, true, false, 100d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, "Sacharuna", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Camping(10, 5, true, false, 100d, "Yaguara", "825 - 42", "Florencia", new Gerente("A", 145l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, "Manantial", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, "Sheraton", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, "Horus", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, "Manantial", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new Residencia(20, true, true, false, 200d, "Manantial", "96876", "Cali", new Gerente("Caleño",978l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCO", 30, 100, 200, 10, 0d, "Alan hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCO", 30, 100, 200, 10, 0d, "AlanA hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCO", 30, 100, 200, 10, 0d, "AlanB hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCuatroEstrellas('a', "COCO", 30, 100, 200, 10, 0d, "AlanC hotel", "12345", "Melbourne", new Gerente("Carmen", 123456l)));
        alojamientos.add(new HotelCincoEstrellas(10, 15, 20, 'B', "Agua", 100, 300, 500, 20, 0d, "Karla hotel", "123456", "Paris", new Gerente("Prisma", 987l)));
        alojamientos.add(new HotelCincoEstrellas(10, 15, 20, 'B', "Agua", 100, 300, 500, 20, 0d, "Karma hotel", "123456", "Paris", new Gerente("Prisma", 987l)));
        alojamientos.add(new HotelCincoEstrellas(10, 15, 20, 'B', "Agua", 100, 300, 500, 20, 0d, "Karmalo hotel", "123456", "Paris", new Gerente("Prisma", 987l)));
        
        alojamientos.forEach(System.out::println);
        
//        Iterator <Alojamiento> iter = alojamientos.iterator();
//        while (iter.hasNext()) {
//            Alojamiento next = iter.next();
//            switch (next.getClass().toString()) {
//                case "Camping" -> System.out.println("A");
//                default -> throw new AssertionError();
//            }
//        }
    }

}
