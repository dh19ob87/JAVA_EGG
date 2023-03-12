//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
//ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaegggroupexercises2;
import java.util.Scanner;
/**
 *
 * @author diego
 */

// charAt
// substring -> Francisco Naranjo
// star y ends

public class EjercicioGrupo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String mensaje;
        int lectura_correcta, lectura_incorrecta;
        lectura_correcta = lectura_incorrecta = 0; 
        
        do {
            System.out.println("Por favor ingrese un mensaje");
            mensaje = input.next();
            if(mensaje.length() <= 5 && mensaje.substring(0, 1).equals("X") && mensaje.substring(mensaje.length()-1).equals("O")){
                lectura_correcta ++;
            }else{
                lectura_incorrecta ++;
            }
        } while (!mensaje.equals("&&&&&"));
        
        
        System.out.printf("Lecturas correctas: %d \n Lecturas incorrectas: %d \n", lectura_correcta, lectura_incorrecta);
    }
}
