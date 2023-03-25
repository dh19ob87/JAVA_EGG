/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexerextra33;
/**
 *
 * @author diego
 */
public class JavaEggExerExtra33 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i <= 999; i++) {
            System.out.printf("%s - %s - %s \n", (i/100 == 3) ? "E" : i/100, (((i/10)%10) == 3) ? "E" : ((i/10)%10), (i%10 == 3) ? "E" : i%10);
        }
    }
    
}
