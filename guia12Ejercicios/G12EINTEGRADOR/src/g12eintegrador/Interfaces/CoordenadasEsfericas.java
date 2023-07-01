/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package g12eintegrador.Interfaces;

/**
 *
 * @author diego
 */
public interface CoordenadasEsfericas {

    public int[] convertirCoordenadasEsfericasACartesianas(boolean isMovil);
    
    public static double calcularVectorRho (int x, int y, int z){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    
    public static double calculaAnguloTheta (int x, int y){
        return (x == 0) ? 0 : (x < 0 && y > 0 || x < 0 && y < 0) ? (Math.atan(y / x) + 180) : (x > 0 && y < 0) ? (Math.atan(y / x) + 360) : (Math.atan(y / x));
    }
    
    public static double calcularAnguloVarphi (int x, int y, int z){
        return Math.acos((z / calcularVectorRho(x, y, z)));
    }
}
