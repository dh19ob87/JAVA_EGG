/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoogrupal2.Service;
import ejerciciopoogrupal2.Entidad.Circunferencia;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CircunferenciaService {
    
    public Circunferencia crearCircunferencia (){
        return new Circunferencia ();
    }
    
    public void agregarRadio(Circunferencia circulo){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese el radio");
        circulo.setRadio(input.nextDouble());
    }
    
    public void areaCirculo (Circunferencia circulo){
        System.out.println("Area = " + (Math.PI * Math.pow(circulo.getRadio(), 2)));
    }
    
    public void perimetroCirculo (Circunferencia circulo){
        System.out.println("Perimetro = " + (2 * Math.PI * circulo.getRadio()));
    }
}
