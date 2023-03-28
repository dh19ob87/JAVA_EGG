/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer14.Servicio;
import java.util.Scanner;
import java.util.Arrays;
import javapooeggexer14.Entidad.Movil;
/**
 *
 * @author diego
 */
public class MovilService {
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular (){
        String marca;
        double precio;
        int modelo;
        int memoriaRam;
        double almacenamiento;
        
        System.out.println("Por favor ingrese la información del celular. \n Marca:");
        marca = INPUT.next();
        System.out.println("Precio:");
        precio = INPUT.nextDouble();
        System.out.println("Modelo:");
        modelo = INPUT.nextInt();
        System.out.println("memoriaRam");
        memoriaRam = INPUT.nextInt();
        System.out.println("Almacenamiento:");
        almacenamiento = INPUT.nextDouble();
        System.out.println("Código:");
        
        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, ingresarCodigo(INPUT));
    }
    
    public int[] ingresarCodigo(Scanner input){
        int [] codigo = new int [7];
        Arrays.setAll(codigo, i -> {
            System.out.println("Ingrese uno a uno el código");
            return input.nextInt();
        });
        return codigo;
    }
    
    public void imprimirMovil (Movil cellphone){
        System.out.println(cellphone.toString() + Arrays.toString(cellphone.getCodigo()));
    }
    
}
