/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra6.Entidad;

/**
 *
 * @author diego
 */
public class Pantalla {
    private String LetrasAdivinadas;
    
    public Pantalla (){}
    
    public Pantalla (String LetrasAdivinadas){
        this.LetrasAdivinadas = LetrasAdivinadas;
    }
    
    public void setLetrasAdivinadas (String word){
        this.LetrasAdivinadas = word;
    }
    
    public String getLetrasAdivinadas (){
        return LetrasAdivinadas;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "LetrasAdivinadas=" + LetrasAdivinadas + '}';
    }
}
