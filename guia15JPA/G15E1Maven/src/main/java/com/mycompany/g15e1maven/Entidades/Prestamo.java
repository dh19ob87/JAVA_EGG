/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g15e1maven.Entidades;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.time.LocalDate;

/**
 *
 * @author diego
 */
@Entity
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
//    @Temporal(TemporalType.DATE) // Nota importante: En la nueva especificación de JPA no es necesaria la anotación @Temporal() porque es específica para el tipo de dato DATE. Entonces se puede colocar directamente LocalDate y en la BD se mapea como date, correspondientemente.
    private LocalDate fechaPrestamo;
//    @Temporal(TemporalType.DATE)
    private LocalDate fechaDevolucion;
    @ManyToOne(targetEntity = Libro.class)
    private List <Libro> libro;
    @OneToOne
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, List<Libro> libro, Cliente cliente) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List<Libro> getLibro() {
        return libro;
    }

    public void setLibro(List<Libro> libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.uuid);
        hash = 73 * hash + Objects.hashCode(this.fechaPrestamo);
        hash = 73 * hash + Objects.hashCode(this.fechaDevolucion);
        hash = 73 * hash + Objects.hashCode(this.libro);
        hash = 73 * hash + Objects.hashCode(this.cliente);
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
        final Prestamo other = (Prestamo) obj;
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.fechaPrestamo, other.fechaPrestamo)) {
            return false;
        }
        if (!Objects.equals(this.fechaDevolucion, other.fechaDevolucion)) {
            return false;
        }
        if (!Objects.equals(this.libro, other.libro)) {
            return false;
        }
        return Objects.equals(this.cliente, other.cliente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamo{");
        sb.append("uuid=").append(uuid);
        sb.append(", fechaPrestamo=").append(fechaPrestamo);
        sb.append(", fechaDevolucion=").append(fechaDevolucion);
        sb.append(", libro=").append(libro);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
}
