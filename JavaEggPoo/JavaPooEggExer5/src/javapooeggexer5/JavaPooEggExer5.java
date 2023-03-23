/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer5;

import javapooeggexer5.Entidad.Cuenta;
import javapooeggexer5.Servicio.CuentaServicio;

/**
 *
 * @author diego
 */
public class JavaPooEggExer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaServicio accountService = new CuentaServicio();
        Cuenta account = accountService.crearCuenta();
        System.out.println("Por favor ingrese la cantidad de dinero a depositar.");
        accountService.ingresar(account, CuentaServicio.INPUT.nextDouble());
        accountService.consultarSaldo(account);
        System.out.println("Por favor ingrese la cantidad de dinero a retirar.");
        accountService.retirar(account, CuentaServicio.INPUT.nextDouble());
        accountService.consultarSaldo(account);
        System.out.println("Ha seleccionado extracción rápida.");
        accountService.extraccionRapida(account);
        accountService.consultarSaldo(account);
        System.out.println("Datos de la cuenta");
        accountService.printDataAccount(account);
    }

}
