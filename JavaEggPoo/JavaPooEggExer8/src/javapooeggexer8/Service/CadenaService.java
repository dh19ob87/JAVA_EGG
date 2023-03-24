/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer8.Service;
import javapooeggexer8.Entidad.Cadena;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CadenaService {
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        System.out.println("Por favor ingrese una frase.");
        return new Cadena(INPUT.next());
    }
    
    public int cantidadVocalesEnFrase (Cadena frase, int posicion, int cantidadVocales){
        if(posicion < frase.getLongitudFrase()){
            if(Character.toLowerCase(frase.getFrase().trim().charAt(posicion)) == 'a' || Character.toLowerCase(frase.getFrase().trim().charAt(posicion)) == 'e' || Character.toLowerCase(frase.getFrase().trim().charAt(posicion)) == 'i' || Character.toLowerCase(frase.getFrase().trim().charAt(posicion)) == 'o' || Character.toLowerCase(frase.getFrase().trim().charAt(posicion)) == 'u'){
                cantidadVocales ++;
            }
            return cantidadVocalesEnFrase(frase, posicion+1, cantidadVocales);
        }else{
            return cantidadVocales;
        }
    }
    
    public void invertirFrase (Cadena frase){
        String invertido = "";
        
        for (int i = frase.getLongitudFrase()-1; i >= 0; i--) {
            invertido += frase.getFrase().charAt(i);
        }
        
        System.out.println(invertido);
    }
    
    public void vecesRepetido (Cadena frase, char caracter, int posicion, int repeticiones){
        if(posicion < frase.getLongitudFrase()){
            if(Character.toLowerCase(frase.getFrase().charAt(posicion)) == caracter){
                repeticiones ++;
            }
            vecesRepetido(frase, caracter, posicion+1, repeticiones);
        }else{
            System.out.printf("La letra %s, se repite %d veces. \n", caracter, repeticiones);
        }
    }
    
    public void compararLongitud (Cadena frase, String nuevaFrase){
        System.out.printf("La frase es %s \n", (frase.getLongitudFrase() - nuevaFrase.length() == 0) ? "igual" : (frase.getLongitudFrase() - nuevaFrase.length() < 1) ? (nuevaFrase.length() - frase.getLongitudFrase()) + " caracteres menor" : (frase.getLongitudFrase() - nuevaFrase.length()) + " caracteres mayor");
    }
    
    public void unirFrases (Cadena frase, String nuevaFrase){
        System.out.println(frase.getFrase().concat(nuevaFrase));
    }
    
    public void reemplazarFrase (Cadena frase, String nuevaFrase){
        frase.setFrase(nuevaFrase);
        frase.setLongitudFrase();
    }
    
    public void reemplazarLetra (Cadena frase, String letra){
        frase.setFrase(frase.getFrase().replace('a', letra.charAt(0)));
    }
    
    public boolean contieneLetra (Cadena frase, String letra){
        return frase.getFrase().contains(letra);
    }
    
    public void printCadena (Cadena frase){
        System.out.println(frase.toString());
    }
}
