/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer3.Servicio;
import java.util.Scanner;
import javapooeggexer3.Entidad.Operacion;
/**
 *
 * @author diego
 */
public class OperacionServicio {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        System.out.println("Por favor ingrese los operandos");
        return new Operacion(INPUT.nextDouble(), INPUT.nextDouble());
    }
    
    public double sumar(Operacion operandos){
        return operandos.getNumero1() + operandos.getNumero2();
    }
    
    public double restar(Operacion operandos){
        return operandos.getNumero1() - operandos.getNumero2();
    }
    
    public double multiplicar(Operacion operandos){
        return operandos.getNumero1() * operandos.getNumero2();
    }
    
    public double dividir(Operacion operandos){
        if(operandos.getNumero2() == 0){
            System.out.println("La división entre cero no está definida.");
            return 0;
        }
        else{
            return operandos.getNumero1() / operandos.getNumero2();
        }
    }
}
