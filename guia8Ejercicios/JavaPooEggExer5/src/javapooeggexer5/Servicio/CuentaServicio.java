/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer5.Servicio;
import java.util.Scanner;
import javapooeggexer5.Entidad.Cuenta;
/**
 *
 * @author diego
 */
public class CuentaServicio {
    
    public static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta (){
        int numeroDeCuenta;
        long dni;
        
        System.out.println("Por favor ingrese su DNI");
        dni = INPUT.nextLong();
        System.out.println("Por favor ingrese el número de cuenta");
        numeroDeCuenta = INPUT.nextInt();
        return new Cuenta(numeroDeCuenta, dni, 0, 0);
    }
    
    public void ingresar (Cuenta account, double dineroAIngresar){
        account.setSaldoActual(account.getSaldoActual() + dineroAIngresar);
    }
    
    public void retirar (Cuenta account, double dineroARetirar){
        account.setSaldoActual((account.getSaldoActual() == 0 || account.getSaldoActual() < dineroARetirar) ? account.getSaldoActual() : (account.getSaldoActual() - dineroARetirar));
    }
    
    public void extraccionRapida (Cuenta account){
        account.setSaldoActual((account.getSaldoActual() == 0) ? 0 : (account.getSaldoActual() - (account.getSaldoActual() * 0.2)));
    }
    
    public void consultarSaldo (Cuenta account){
        System.out.println("Saldo disponible: " + account.getSaldoActual());
    }
    
    public void consultarDatos (Cuenta account){
        System.out.println(account.toString());
    }
    
    public void printDataAccount (Cuenta account){
        System.out.println(account.toString());
    }
}
