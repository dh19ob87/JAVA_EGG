/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package g12eintegrador.Interfaces;

/**
 *
 * @author diego
 */
public interface CoordenadasCartesianas {
    public static double calcularDistanciaMedianteModuloVector(int x, int y, int z){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
