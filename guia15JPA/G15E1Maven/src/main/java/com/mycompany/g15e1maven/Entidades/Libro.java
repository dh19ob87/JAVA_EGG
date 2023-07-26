/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g15e1maven.Entidades;

import jakarta.persistence.Column;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Objects;
import java.util.UUID;
//import jakarta.persistence.JoinColumn;

/**
 *
 * @author diego
 */
@Entity
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    @Column(nullable = false, unique = true)
    private Long isbn;
    @Column(unique = true)
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    @ManyToOne(targetEntity = Autor.class)
//    @JoinColumn(name = "uuid1") // Importantísimo señalar que esta declaración nos permite indicar el nombre que le vamos a dar a nuestra llave foranea en la BD. Si no, EclipseLink se encarga de ponerle un nombre, para este caso pone: AUTOR_UUID
    private Autor autor;
    @ManyToOne(targetEntity = Editorial.class)
//    @JoinColumn(name = "uuid2") // Importantísimo señalar que esta declaración nos permite indicar el nombre que le vamos a dar a nuestra llave foranea en la BD. Si no, EclipseLink se encarga de ponerle un nombre, para este caso pone: AUTOR_UUID
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.autor = autor;
        this.editorial = editorial;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.uuid);
        hash = 97 * hash + Objects.hashCode(this.isbn);
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.anio);
        hash = 97 * hash + Objects.hashCode(this.ejemplares);
        hash = 97 * hash + Objects.hashCode(this.ejemplaresPrestados);
        hash = 97 * hash + Objects.hashCode(this.ejemplaresRestantes);
        hash = 97 * hash + Objects.hashCode(this.autor);
        hash = 97 * hash + Objects.hashCode(this.editorial);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.anio, other.anio)) {
            return false;
        }
        if (!Objects.equals(this.ejemplares, other.ejemplares)) {
            return false;
        }
        if (!Objects.equals(this.ejemplaresPrestados, other.ejemplaresPrestados)) {
            return false;
        }
        if (!Objects.equals(this.ejemplaresRestantes, other.ejemplaresRestantes)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.editorial, other.editorial);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("uuid=").append(uuid);
        sb.append(", isbn=").append(isbn);
        sb.append(", titulo=").append(titulo);
        sb.append(", anio=").append(anio);
        sb.append(", ejemplares=").append(ejemplares);
        sb.append(", ejemplaresPrestados=").append(ejemplaresPrestados);
        sb.append(", ejemplaresRestantes=").append(ejemplaresRestantes);
        sb.append(", autor=").append(autor);
        sb.append(", editorial=").append(editorial);
        sb.append('}');
        return sb.toString();
    }
}
