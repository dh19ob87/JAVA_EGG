/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer1.Entidad;

import guia11exer1.Enumerables.RazaPerros;
/**
 *protected String nombre;
    protected String alimento;
    protected int edad;
    protected T raza;
 * @author diego
 */
public class Perro extends Animal <RazaPerros> {
    public Perro(String nombre, String alimento, int edad, RazaPerros raza){
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void sonidoAnimal(){
        System.out.println("Guau");
    }
}
