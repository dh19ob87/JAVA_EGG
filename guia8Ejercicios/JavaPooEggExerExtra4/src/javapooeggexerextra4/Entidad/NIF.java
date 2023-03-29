/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra4.Entidad;

/**
 *
 * @author diego
 */
public class NIF {

    private long DNI;
    private char letra;

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
}
