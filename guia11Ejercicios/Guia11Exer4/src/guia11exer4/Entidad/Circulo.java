/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11exer4.Entidad;

import guia11exer4.Interfaces.calculosFormas;

/**
 *
 * @author diego
 */
public class Circulo implements calculosFormas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public Double calcularArea(double ... values) {
        return PI * (Math.pow(values[0], 2));
    }

    @Override
    public Double calcularPerimetro(double ... values) {
        return (2*values[0]) * PI;
    }
    
    public Double calcularArea(double radio) {
        return Math.PI * (Math.pow(radio, 2));
    }
    
    public Double calcularPerimetro(double radio){
        return (2 * radio) * Math.PI;
    }
}
