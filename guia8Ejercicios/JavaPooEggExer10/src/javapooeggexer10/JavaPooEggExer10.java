/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer10;
import java.util.Arrays;
/**
 *
 * @author diego
 */
public class JavaPooEggExer10 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double [] arrayGrande = new double [50];
        double [] arrayPequenio = new double [20];
        
        
        
        Arrays.setAll(arrayGrande, (a) -> arrayGrande[a] = Math.random()*51);
        System.out.println(Arrays.toString(arrayGrande));
        Arrays.sort(arrayGrande);
        System.out.println(Arrays.toString(arrayGrande));
        System.out.println("");
        Arrays.setAll(arrayPequenio, (i) -> (i < 10) ? arrayGrande[i] : 0.5);
        System.out.println(Arrays.toString(arrayPequenio));
    }
    
}
