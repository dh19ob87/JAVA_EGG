/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Entidad;

import guia11exer1.Enumerables.RazaGatos;
/**
 *
 * @author diego
 */
public class Gato extends Animal<RazaGatos>{
    public Gato(String nombre, String alimento, int edad, RazaGatos raza){
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void sonidoAnimal(){
        System.out.println("Miau");
    }
}
