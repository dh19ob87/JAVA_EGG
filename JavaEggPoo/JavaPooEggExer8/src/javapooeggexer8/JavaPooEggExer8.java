/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer8;
import javapooeggexer8.Entidad.Cadena;
import javapooeggexer8.Service.CadenaService;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class JavaPooEggExer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        CadenaService cs = new CadenaService();
        Cadena frase = cs.crearCadena();
        Cadena frase2 = cs.crearCadena();
        System.out.println(cs.cantidadVocalesEnFrase(frase, 0, 0));
        System.out.println(cs.cantidadVocalesEnFrase(frase2, 0, 0));
        cs.invertirFrase(frase);
        System.out.println("Por favor ingrese una letra.");
        cs.vecesRepetido(frase, input.next().charAt(0), 0, 0);
        System.out.println("Por favor ingrese una frase para comparar la longitud");
        cs.compararLongitud(frase, input.next());
        System.out.println("Por favor ingrese una letra a reemplazar");
        cs.reemplazarLetra(frase, String.valueOf(input.next().charAt(0)));
        cs.printCadena(frase);
        System.out.println("Por favor ingrese una letra para comprobar si está dentro de la cadena.");
        System.out.println(cs.contieneLetra(frase, input.next()));
    }
    
}
