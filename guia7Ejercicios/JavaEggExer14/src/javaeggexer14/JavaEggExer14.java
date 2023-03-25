/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer14;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExer14 {

    /**
     * @param args the command line arguments
     */
    
    private enum Divisa {
            EURO,
            USD,
            YENES,
            LIBRAS
        }
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float eur;
        String divisa;
        
        eur = 0;
        
        System.out.println("Por favor ingrese una cantidad en EUR");
        eur = Float.parseFloat(CONSOLE.readLine());
        
        System.out.println("Por favor indique la divisa a la que quiere convertir: \n USD \n YENES \n LIBRAS");
        divisa  = CONSOLE.readLine();
        
        
        
        System.out.printf("%f EUR = %f %s \n", eur, (Divisa.USD.name().compareTo(divisa) == 0) ? (eur * 1.06) : (Divisa.YENES.name().compareTo(divisa) == 0) ? (eur * 144.87) : (Divisa.LIBRAS.name().compareTo(divisa) == 0) ? (eur * 0.89) : 0, (Divisa.USD.name().compareTo(divisa) == 0) ? "USD" : (Divisa.YENES.name().compareTo(divisa) == 0) ? "YENES" : (Divisa.LIBRAS.name().compareTo(divisa) == 0) ? "LIBRAS" : "Error");
    }
    
}
