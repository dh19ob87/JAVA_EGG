/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra5.Entidad;

/**
 *
 * @author diego
 */
public class Palabra {

    private String mesSecreto;

    public Palabra() {
    }

    public Palabra(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Palabra{" + "mesSecreto=" + mesSecreto + '}';
    }
}
