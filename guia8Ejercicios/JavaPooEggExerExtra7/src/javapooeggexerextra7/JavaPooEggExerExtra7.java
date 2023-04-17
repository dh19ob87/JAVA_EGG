/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package javapooeggexerextra7;

import javapooeggexerextra7.Entidad.Fraccion;
import javapooeggexerextra7.Servicio.FraccionServicio;

/**
 *
 * @author diego
 */
public class JavaPooEggExerExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FraccionServicio fs = new FraccionServicio();
        fs.menuOperaciones(fs.crearOperandos());
    }

}
