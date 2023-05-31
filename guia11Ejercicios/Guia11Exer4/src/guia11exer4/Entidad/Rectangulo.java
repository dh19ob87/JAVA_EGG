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
public class Rectangulo implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    @Override
    public Double calcularArea (double ... values){
        return values[0] * values[1];
    }
    
    @Override
    public Double calcularPerimetro(double ... values){
        return (values[0]+ values[1]) * 2;
    }
    
    public Double calcularArea(double base, double altura){
        return base * altura;
    }
    
    public Double calcularPerimetro(double base, double altura){
        return (base + altura) * 2;
    }
}
