/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer3;
import javapooeggexer3.Entidad.Operacion;
import javapooeggexer3.Servicio.OperacionServicio;
/**
 *
 * @author diego
 */
public class JavaPooEggExer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionServicio os = new OperacionServicio();
        Operacion operandos = os.crearOperacion();
        System.out.printf("%f + %f = %f \n", operandos.getNumero1(), operandos.getNumero2(), os.sumar(operandos));
        System.out.printf("%f + %f = %f \n", operandos.getNumero1(), operandos.getNumero2(), os.restar(operandos));
        System.out.printf("%f + %f = %f \n", operandos.getNumero1(), operandos.getNumero2(), os.multiplicar(operandos));
        System.out.printf("%f + %f = %f \n", operandos.getNumero1(), operandos.getNumero2(), os.dividir(operandos));
    }
    
}
