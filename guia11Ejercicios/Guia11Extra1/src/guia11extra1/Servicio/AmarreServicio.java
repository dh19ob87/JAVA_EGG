/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Entidad.Amarre;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class AmarreServicio {
    public ArrayList<Amarre> crearAmarres(){
        ArrayList <Amarre> amarresPuerto = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            amarresPuerto.add(new Amarre(i+1, true));
        }
        return amarresPuerto;
    }
    
    public void printAmarresPuerto(ArrayList <Amarre> amarres){
        amarres.forEach(System.out::println);
    }
}
