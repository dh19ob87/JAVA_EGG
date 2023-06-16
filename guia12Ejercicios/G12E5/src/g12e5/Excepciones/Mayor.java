/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package g12e5.Excepciones;

/**
 *
 * @author diego
 */
public class Mayor extends Exception{

    /**
     * Creates a new instance of <code>Mayor</code> without detail message.
     */
    public Mayor() {
    }

    /**
     * Constructs an instance of <code>Mayor</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public Mayor(String msg) {
        super(msg);
    }
}
