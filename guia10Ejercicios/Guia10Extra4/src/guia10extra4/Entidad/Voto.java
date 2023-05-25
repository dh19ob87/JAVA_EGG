/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Entidad;

import java.util.LinkedList;
import java.util.Objects;
/**
 *
 * @author diego
 */
public class Voto {
    private Alumno student;
    private LinkedList <Alumno> votosOtorgados;

    public Voto() {
    }

    public Voto(Alumno student, LinkedList<Alumno> votosOtorgados) {
        this.student = student;
        this.votosOtorgados = votosOtorgados;
    }

    public Alumno getStudent() {
        return student;
    }

    public void setStudent(Alumno student) {
        this.student = student;
    }

    public LinkedList<Alumno> getVotosOtorgados() {
        return votosOtorgados;
    }

    public void setVotosOtorgados(LinkedList<Alumno> votosOtorgados) {
        this.votosOtorgados = votosOtorgados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.student);
        hash = 97 * hash + Objects.hashCode(this.votosOtorgados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        return Objects.equals(this.votosOtorgados, other.votosOtorgados);
    }

    @Override
    public String toString() {
        return "Voto{" + "student=" + student + ", votosOtorgados=" + votosOtorgados + '}';
    }   
}
