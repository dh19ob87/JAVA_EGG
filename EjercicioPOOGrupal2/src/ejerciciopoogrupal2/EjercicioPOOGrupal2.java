/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package ejerciciopoogrupal2;
import ejerciciopoogrupal2.Entidad.Circunferencia;
import ejerciciopoogrupal2.Service.CircunferenciaService;
/**
 *
 * @author diego
 */
public class EjercicioPOOGrupal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia circulo = cs.crearCircunferencia();
        System.out.println(circulo.toString());
        cs.agregarRadio(circulo);
        System.out.println(circulo.toString());
        cs.areaCirculo(circulo);
        cs.perimetroCirculo(circulo);
    }
    
}
