/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra26;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra26 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char tipoDeSocio;
        int valorTratamiento;
        
        System.out.println("Por favor ingrese la clase del socio");
        tipoDeSocio = CONSOLE.readLine().charAt(0);
        System.out.println("Por favor ingrese el valor del tratamiento");
        valorTratamiento = Integer.parseInt(CONSOLE.readLine());
        System.out.printf("Dcto. %d %%, debe pagar = %d \n", (tipoDeSocio == 'A') ? 50 : (tipoDeSocio == 'B') ? 35 : 0, (tipoDeSocio == 'A') ? (int) (valorTratamiento - (valorTratamiento * 0.5)) : (tipoDeSocio == 'B') ? (int) (valorTratamiento - (valorTratamiento * 0.35)) : (tipoDeSocio == 'C') ? valorTratamiento : valorTratamiento);
    }
    
}
