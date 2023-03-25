/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer9.Servicio;
import javapooeggexer9.Entidad.Matematica;
/**
 *
 * @author diego
 */
public class MatematicaServicio {
    
    public Matematica crearMatematica (){
        return new Matematica(Math.random()*100, Math.random()*10);
    }
    
    public Matematica crearMatematicaSetters(){
        Matematica newton = new Matematica();
        System.out.println("Números creados");
        newton.setNumeroA(Math.random() * 10);
        newton.setNumeroB(Math.random() * 10);
        return newton;
    }
    
    public double devolverMayor (Matematica newton){
        return (newton.getNumeroA() == newton.getNumeroB()) ? 0 : (newton.getNumeroA() > newton.getNumeroB()) ? newton.getNumeroA() : newton.getNumeroB();
    }
    
    public double calcularPotencia (Matematica turing){
        double mayor = devolverMayor(turing);
        return (mayor == 0) ? (Math.pow(Math.round(mayor), mayor)) : (mayor == turing.getNumeroA()) ? (Math.pow(Math.round(mayor), Math.round(turing.getNumeroB()))) : (Math.pow(mayor, turing.getNumeroA()));
    }
    
    public double calcularRaiz (Matematica shannon) {
        double mayor = devolverMayor(shannon);
        double menor = (mayor == 0) ? shannon.getNumeroA() : (mayor == shannon.getNumeroA()) ? shannon.getNumeroB() : shannon.getNumeroA();
        return Math.sqrt(Math.abs(Math.round(menor)));
    }
    
    public void printMatematica (Matematica newton){
        System.out.println(newton.toString());
    }
}
