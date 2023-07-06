/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g14e1;

import g14e1.Entidades.Fabricante;
import g14e1.Servicio.FabricanteServicio;

/**
 *
 * @author diego
 */
public class G14E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FabricanteServicio fs =  new FabricanteServicio();
            fs.consultarTodosLosFabricantes().forEach(System.out::println);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
