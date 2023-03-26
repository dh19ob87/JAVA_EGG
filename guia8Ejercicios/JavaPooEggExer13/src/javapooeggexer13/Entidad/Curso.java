/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexer13.Entidad;

/**
 *
 * @author diego
 */

enum jornada {MANANA, TARDE};

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private jornada turno;
    private double precioPorHora;
    private String [] alumnos = new String [5];
    public Curso (){}
    
    /**
     * 
     * @param nombreCurso
     * @param cantidadHorasPorDia
     * @param cantidadDiasPorSemana
     * @param turno
     * @param precioPorHora
     * @param alumnos 
     */
    
    public Curso (String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, int turno, double precioPorHora, String [] alumnos){
        this.nombreCurso = nombreCurso;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.turno = (turno == 0) ? jornada.MANANA : jornada.TARDE;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
    
    public void setNombreCurso (String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    
    public void setCantidadHorasPorSemana (int cantidadHorasPorSemana){
        this.cantidadDiasPorSemana = cantidadHorasPorSemana;
    }
    
    public void setCantidadDiasPorSemana (int cantidadDiasPorSemana){
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    
    public void setTurno (jornada turno){
        this.turno = turno;
    }
    
    public void setPrecioPorHora (double precioPorHora){
        this.precioPorHora = precioPorHora;
    }
    
    public void setAlumnos (String [] Alumnos){
        this.alumnos = Alumnos;
    }
    
    public String getNombreCurso (){
        return nombreCurso;
    }
    
    public int getCantidadHorasPorDia(){
        return cantidadHorasPorDia;
    }
    
    public int getCantidadDiasPorSemana(){
        return cantidadDiasPorSemana;
    }
    
    public jornada getTurno (){
        return turno;
    }
    
    public double getPrecioPorHora (){
        return precioPorHora;
    }
    
    public String[] getAlumnos(){
        return alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + alumnos + '}';
    }
}
