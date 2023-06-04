/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra.Entidad;

import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class EdificioDeOficinas extends Edificio {

    private LinkedList<Oficina> oficinas;
    private Integer maxPersonasEdificio;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(LinkedList<Oficina> oficinas, Integer maxPersonasEdificio, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.maxPersonasEdificio = maxPersonasEdificio;
    }

    public LinkedList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(LinkedList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getMaxPersonasEdificio() {
        return maxPersonasEdificio;
    }

    public void setMaxPersonasEdificio(Integer maxPersonasEdificio) {
        this.maxPersonasEdificio = maxPersonasEdificio;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "oficinas=" + oficinas + ", maxPersonasEdificio=" + maxPersonasEdificio + '}';
    }
    
    @Override
    public Double calcularSuperficie(){
        return ancho * largo;
    }
    
    @Override
    public Double calcularVolumen(){
        return ancho * largo * alto;
    }
}
