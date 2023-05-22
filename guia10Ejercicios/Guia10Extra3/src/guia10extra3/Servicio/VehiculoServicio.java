/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Servicio;

import java.util.Scanner;
import guia10extra3.Entidad.Persona;
import guia10extra3.Entidad.Vehiculo;
import guia10extra3.Enumerables.Colores;
import guia10extra3.Enumerables.MarcasAutos;
import guia10extra3.Enumerables.TipoVehiculo;
import java.util.Locale;
import java.time.Year;
/**
 *
 * @author diego
 */
public class VehiculoServicio{
    
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Vehiculo crearVehiculo(Persona propietario){
        String marcaAuto, codigoChasis, colorAuto, tipoAuto;
        int modeloAuto, numeroMotor;
        
        System.out.println("Por favor ingrese la marca del auto");
        imprimirmarcasAutos();
        marcaAuto = INPUT.next().toUpperCase();
        System.out.println("Por favor ingrese el modelo del auto");
        modeloAuto = INPUT.nextInt();
        System.out.println("Por favor ingrese el número del motor");
        numeroMotor = INPUT.nextInt();
        System.out.println("Por fvor ingrese el código de chasis");
        codigoChasis = INPUT.next();
        System.out.println("Por favor ingrese el color del auto");
        imprimirColores();
        colorAuto = INPUT.next().toUpperCase();
        System.out.println("Por favor ingrese el tipo de auto");
        imprimirTipoVehiculo();
        tipoAuto = INPUT.next().toUpperCase();
        return new Vehiculo (MarcasAutos.valueOf(marcaAuto), Year.of(modeloAuto), numeroMotor, codigoChasis, Colores.valueOf(colorAuto), TipoVehiculo.valueOf(tipoAuto), propietario);
    }
    
    private void imprimirColores(){
        for(Colores elemento : Colores.values()){
            System.out.println(elemento);
        }
    }
    
    private void imprimirmarcasAutos(){
        for(MarcasAutos elemento : MarcasAutos.values()){
            System.out.println(elemento);
        }
    }
    
    private void imprimirTipoVehiculo(){
        for(TipoVehiculo elemento : TipoVehiculo.values()){
            System.out.println(elemento);
        }
    }
    
    public void imprimirDatosAuto (Vehiculo auto){
        System.out.println(auto.toString());
    }
}
