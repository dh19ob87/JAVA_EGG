/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12e1;

/**
 *
 * @author diego
 */
public class G12E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona one = null;
        
        try {
            one.getEdad();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Objeto nulo");
        }
    }
    
}
