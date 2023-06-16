/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra4.Entidad;

import guia11extra4.Enumerables.EstadoCivil;
import guia11extra4.Utilidades.IOUtilities;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Estudiante extends Persona{
    
    private ArrayList<String> cursosInscritos;

    public Estudiante() {
    }

    public Estudiante(ArrayList<String> cursosInscritos, String nombres, String apellidos, Long dni, EstadoCivil estadoCivil) {
        super(nombres, apellidos, dni, estadoCivil);
        this.cursosInscritos = cursosInscritos;
    }

    public ArrayList<String> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(ArrayList<String> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }
    
    @Override
    public void cambiarEstadoCivil(){
        System.out.println("Por favor ingrese el nuevo estado civil");
        System.out.println(Arrays.toString(EstadoCivil.values()));
        super.setEstadoCivil(EstadoCivil.valueOf(IOUtilities.input.next()));
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursosInscritos=" + cursosInscritos + '}' + super.toString();
    }
}
