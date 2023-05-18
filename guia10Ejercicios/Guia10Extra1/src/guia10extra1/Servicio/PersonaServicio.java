/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra1.Servicio;

import guia10extra1.Entidad.Persona;
import java.util.Locale;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author diego
 */
public class PersonaServicio {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private static LinkedList <Persona> personas = new LinkedList<>();
    
    public Persona crearPersona (){
        System.out.println("Por favor ingrese el nombre, apellido, edad, documento de la persona.");
        return new Persona(INPUT.next(), INPUT.next(), INPUT.nextInt(), INPUT.nextLong());
    }
    
    public void registrarPersona (){
        personas.add(crearPersona());
    }
    
    public LinkedList <Persona> getPersonasRegistradas (){
        return personas;
    }
    
    public int getIndexAdoptante (Iterator <Persona> iter, long documento, int posicion){
        if(!iter.hasNext()){
            return -1;
        }else if(iter.next().getDocumento() == documento){
            return posicion;
        }else{
            posicion ++;
            return getIndexAdoptante(iter, documento, posicion);
        }
    }
    
    public void adoptarPerrito(){
        PerroServicio ps = new PerroServicio();
        if(ps.hayLomitos()){
            System.out.println("Agradecemos profundamente tu interés. Ahora mismo tenemos la feliz noticia de que todos los lomitos fueron adoptados por dueños amorosos, responsables, sintientes, empáticos y serviciales al ese ser estupendo, su lomito. ¡No desistas, encontraremos uno para ti, la vida de ambos cambiará para mejor, juntos.!");
        }else{
            System.out.println("Por favor ingrese el documento de identidad del adoptante.");
            ps.darPerroEnAdopcion(personas.get(getIndexAdoptante(personas.iterator(), INPUT.nextLong(), 0)));
        }
    }
    
    public void personasRegistradas (){
        personas.forEach(System.out::println);
    }
    
    public void iniciarEmpresa (){
        int salir;
        PerroServicio ps = new PerroServicio();
        ps.crearPerrosEnAdopcion();
        System.out.println("Bienvenido. Vamos a registrar una personas para poder iniciar.");
        registrarPersona();
        do {
            System.out.println("Bienvenido");
            System.out.println("1.Registrar Persona\n2. Imprimir personas registradas.\n3. Imprimir perritos en adopción.\n4. Adoptar un lomito.\n0. Salir");
            salir = INPUT.nextInt();
            switch (salir) {
                case 0 -> System.out.println("Hasta pronto");
                case 1 -> registrarPersona();
                case 2 -> personasRegistradas();
                case 3 -> ps.imprimirLomitosEnAdopcion();
                case 4 -> {
                    personasRegistradas();
                    adoptarPerrito();
                }
                default -> System.out.println("Hasta pronto. Gracias por adoptar, por cambiar el mundo de un lomito.");
            }
        } while (salir != 0);
    }
}
