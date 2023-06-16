/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12e2;

/**
 *
 * @author diego
 */
public class G12E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] array = {"a", "b", "c", "d", "e", "f", "g"};
        Tienda store = new Tienda(array);
        imprimirProductos(store);
        System.out.println("Continúo mi ejecución");
    }
    
    public static void imprimirProductos (Tienda store){
        try{
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                System.out.println(store.getProductos()[i]);
            }
        }catch(ArrayIndexOutOfBoundsException | ArrayStoreException e){
            System.out.println(e.getMessage());
        }
    }
    
}
