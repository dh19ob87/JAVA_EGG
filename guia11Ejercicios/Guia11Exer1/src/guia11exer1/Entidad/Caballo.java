/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Entidad;

import guia11exer1.Enumerables.RazaCaballo;
/**
 *
 * @author diego
 */

public class Caballo extends Animal<RazaCaballo>{
    public Caballo (String nombre, String alimento, int edad, RazaCaballo raza){
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void sonidoAnimal(){
        super.sonidoAnimal();
        System.out.println("jjijijijij");
    }
}