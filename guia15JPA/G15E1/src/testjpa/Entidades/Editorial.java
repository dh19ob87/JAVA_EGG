/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjpa.Entidades;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "Editorial")
public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
//    Funciona para generar un incremento en el identificador de 1 en 1. Y no de 50 en 50.
//    @TableGenerator(
//            name = "yourTableGenerator"
//    allocationSize  = 1,
//            initialValue = 1
//    )
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.TABLE,
//            generator = "yourTableGenerator")

//    No lo he probado
//    @SequenceGenerator(name = "yourSequenceGenerator", allocationSize = 1)
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "yourSequenceGenerator")
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Boolean alta;

    public Editorial() {
    }

    public Editorial(Integer id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.alta);
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
        final Editorial other = (Editorial) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.alta, other.alta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Editorial{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", alta=").append(alta);
        sb.append('}');
        return sb.toString();
    }
}
